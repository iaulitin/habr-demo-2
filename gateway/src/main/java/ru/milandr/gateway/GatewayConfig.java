package ru.milandr.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r
                        .path("/view/**")
                        .uri("lb://ui-service/"))
                .route(r -> r
                        .path("/hello/**")
                        .uri("lb://hello-service/"))
                .route(r -> r
                        .path("/goodbye/**")
                        .uri("lb://goodbye-service/"))
                .build();
    }
}
