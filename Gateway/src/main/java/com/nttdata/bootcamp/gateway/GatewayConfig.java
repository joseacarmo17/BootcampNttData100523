package com.nttdata.bootcamp.gateway;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDiscoveryClient
public class GatewayConfig {

  @Bean
  public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
    return builder.routes()
        .route("inventario", r -> r.path("/inventario/**")
            .filters(f -> f
                .filter(preFilter1())
                .filter(preFilter2())
                .filter(preFilter3())
                .filter(postFilter1())
                .filter(postFilter2())
                .filter(postFilter3()))
            .uri("lb://inventario-service"))
        .route("factura", r -> r.path("/factura/**")
            .filters(f -> f
                .filter(preFilter1())
                .filter(preFilter2())
                .filter(preFilter3())
                .filter(postFilter1())
                .filter(postFilter2())
                .filter(postFilter3()))
            .uri("lb://factura-service"))
        .route("personal", r -> r.path("/personal/**")
            .filters(f -> f
                .filter(preFilter1())
                .filter(preFilter2())
                .filter(preFilter3())
                .filter(postFilter1())
                .filter(postFilter2())
                .filter(postFilter3()))
            .uri("lb://personal-service"))
        .build();
  }

  @Bean
  public GatewayFilter preFilter1() {
    return (exchange, chain) -> {
      // Lógica del primer pre-filtro
      return chain.filter(exchange);
    };
  }

  @Bean
  public GatewayFilter preFilter2() {
    return (exchange, chain) -> {
      // Lógica del segundo pre-filtro
      return chain.filter(exchange);
    };
  }

  @Bean
  public GatewayFilter preFilter3() {
    return (exchange, chain) -> {
      // Lógica del tercer pre-filtro
      return chain.filter(exchange);
    };
  }

  @Bean
  public GatewayFilter postFilter1() {
    return (exchange, chain) -> {
      // Lógica del primer post-filtro
      return chain.filter(exchange);
    };
  }

  @Bean
  public GatewayFilter postFilter2() {
    return (exchange, chain) -> {
      // Lógica del segundo post-filtro
      return chain.filter(exchange);
    };
  }

  @Bean
  public GatewayFilter postFilter3() {
    return (exchange, chain) -> {
      // Lógica del tercer post-filtro
      return chain.filter(exchange);
    };
  }
}


