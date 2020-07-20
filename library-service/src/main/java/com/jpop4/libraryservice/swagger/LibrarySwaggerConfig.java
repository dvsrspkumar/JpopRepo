package com.jpop4.libraryservice.swagger;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class LibrarySwaggerConfig {

    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jpop4.bookservice"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo());
    }

    public ApiInfo getApiInfo() {
        return  new ApiInfo("Library Service","App to demonstrate Library Service Operations",
                "1.1.0","Terms of Service",
                new Contact("Pavan Kumar - JPOP4", "libraryService.com", "Pavan.Devarakonda@epam.com"),
                "","", Collections.emptyList());
    }
}
