package com.ketan.fulzele;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
public class WeshopifyPlatformSagaProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeshopifyPlatformSagaProductServiceApplication.class, args);
	}

}
