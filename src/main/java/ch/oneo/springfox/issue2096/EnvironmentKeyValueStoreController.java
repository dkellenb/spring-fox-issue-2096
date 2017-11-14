package ch.oneo.springfox.issue2096;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/store")
@Api(value="property", description="Retrieve values for an environment")
public class EnvironmentKeyValueStoreController {

    @RequestMapping(method = RequestMethod.GET, path = "{propertyKey}/{environmentKey}")
    public ResponseEntity<String> getProperty(
            @ApiParam(name = "propertyKey", value = "Key of the property", required = true, type = "String") @PathVariable("propertyKey") Key propertyKey,
            @ApiParam(name = "environmentKey", value = "Key of the environment", required = false) @PathVariable("environmentKey") Key environmentKey
    ) {
        return new ResponseEntity<String>("nothing", HttpStatus.OK);
    }

}
