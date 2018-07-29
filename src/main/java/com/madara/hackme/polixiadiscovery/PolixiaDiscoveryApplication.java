package com.madara.hackme.polixiadiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PolixiaDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolixiaDiscoveryApplication.class, args);
	}
}
