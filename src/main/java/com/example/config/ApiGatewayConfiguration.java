package com.example.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {

		return builder.routes()
				.route(p -> p.path("/Enquiry-Service/**")
				.uri("lb:/Enquiry-Service"))
			
				.build();
	}
}
