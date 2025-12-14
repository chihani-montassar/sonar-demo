package tn.esprit.tp_foyer.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Gestion des foyers") // Définition du titre
                        .version("2.0")                      // Définition de la version
                        .description("Un TP de gestion des foyers") // Définition de la description
                        .contact(new Contact()
                                .name("Emna Homrani")
                                .email("emna.homani@esprit.tn")
                                .url("https://www.linkedin.com/in/emna-homrani"))
                        .termsOfService("https://www.google.com")
                        .summary("Application pour la gestion des foyers")
                );
    }
    @Bean
    public GroupedOpenApi blocPublicAPI(){
        return GroupedOpenApi.builder().group("bloc Managment").pathsToMatch("/bloc/**").pathsToExclude("**").build();
    }
    @Bean
    public GroupedOpenApi chambrePublicAPI(){
        return GroupedOpenApi.builder().group("chambre Managment").pathsToMatch("/chambre/**").pathsToExclude("**").build();
    }
    @Bean
    public GroupedOpenApi etudiantPublicAPI(){
        return GroupedOpenApi.builder().group("etudiant Managment").pathsToMatch("/etudiant/**").pathsToExclude("**").build();
    }
    @Bean
    public GroupedOpenApi foyerPublicAPI(){
        return GroupedOpenApi.builder().group("foyer Managment").pathsToMatch("/foyer/**").pathsToExclude("**").build();
    }
    @Bean
    public GroupedOpenApi reservationPublicAPI(){
        return GroupedOpenApi.builder().group("reservation Managment").pathsToMatch("/reservation/**").pathsToExclude("**").build();
    }
    @Bean
    public GroupedOpenApi universitePublicAPI(){
        return GroupedOpenApi.builder().group("universite Managment").pathsToMatch("/universite/**").pathsToExclude("**").build();
    }
}
