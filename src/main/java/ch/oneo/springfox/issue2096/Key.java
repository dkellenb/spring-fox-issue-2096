package ch.oneo.springfox.issue2096;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Key {

    @JsonCreator
    public Key(@JsonProperty("key") String keyContent) {
        key = keyContent;
    }

    // if enabled, name will be shown @ApiModelProperty(value = "my description")
    private final String key;

}
