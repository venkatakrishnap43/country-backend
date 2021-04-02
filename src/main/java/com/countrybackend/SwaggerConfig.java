package com.countrybackend;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Component
@EnableSwagger2
public class SwaggerConfig{

    @Bean
    public Docket Country() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Country")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.countrybackend.Country"))
                .paths(PathSelectors.any())
                .build();
    }

//    @Bean
//    public Docket city() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("City")
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.countrybackend.City"))
//                .paths(PathSelectors.any())
//                .build();
//    }

}