package ru.chavkin.gp.managerservice.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestClient;
import ru.chavkin.gp.managerservice.client.RestClientProductsRestClient;

/**
 * @author Vladimir Chavkin (vladimirchavkinwork@gmail.com)
 */

@Configuration
public class ClientBeans {
    @Bean
    public RestClientProductsRestClient productsRestClient(
            @Value("${springshop.services.catalogue.uri:http://localhost:8082}") String catalogueBaseUri,
            @Value("${springshop.services.catalogue.auth.username:}") String catalogueAuthUsername,
            @Value("${springshop.services.catalogue.auth.password:}") String catalogueAuthPassword) {
        return new RestClientProductsRestClient(RestClient.builder()
                .baseUrl(catalogueBaseUri)
                .requestInterceptor(new BasicAuthenticationInterceptor(catalogueAuthUsername, catalogueAuthPassword))
                .build());
    }
}
