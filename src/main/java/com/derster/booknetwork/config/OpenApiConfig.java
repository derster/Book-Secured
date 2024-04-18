package com.derster.booknetwork.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
     info = @Info(
             contact = @Contact(
                     name = "Modeste KOUAIO",
                     email = "modstk1@gmail.com",
                     url = "https://docvite.com"
             ),
             description = "OpenApi documentation for Spring security",
             title = "OpenApi Specification - Modeste",
             version = "1.0",
             license = @License(
                     name = "Licence name",
                     url = "https://docvite.com"
             ),
             termsOfService = "Terms of service"
     ),
        servers = {
             @Server(
                     description = "Local ENV",
                     url = "http://localhost:8080/api/v1/"
             ),
            @Server(
                    description = "PROD ENV",
                    url = "https://docvite.com/api/v1/"
            )
        },
        security = {
             @SecurityRequirement(
                     name = "bearerAuth"
             )
        }
)
@SecurityScheme(
        name = "bearerAuth",
        description = "JWT auth description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
}
