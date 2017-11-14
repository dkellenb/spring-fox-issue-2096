package ch.oneo.springfox.issue2096;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static java.util.Collections.emptyList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket demoApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("ch.oneo.springfox.issue2096"))
                .paths(PathSelectors.any())
                .build()
                .groupName("demo")
                .apiInfo(metaData());
    }

    private ApiInfo metaData() {
        return new ApiInfo(
                "SpringFox Issue 2096",
                "REST API",
                "1.0",
                "",
                new Contact("Daniel Kellenberger", "https://oneo.ch/", ""),
                "",
                "",
                emptyList());
    }

}
