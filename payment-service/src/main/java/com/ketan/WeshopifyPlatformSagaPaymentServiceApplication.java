package com.ketan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.ketan.outbound"})
@EnableDiscoveryClient
public class WeshopifyPlatformSagaPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeshopifyPlatformSagaPaymentServiceApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

}
