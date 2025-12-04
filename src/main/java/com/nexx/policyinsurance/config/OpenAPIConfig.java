package com.nexx.policyinsurance.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI policyInsuranceOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Policy Insurance API")
                        .description("API documentation for Policy Insurance Application")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Nexx")
                                .email("iamsubratojha@gmail.com"))
                        .license(new License().name("Apache 2.0")));
    }
}
