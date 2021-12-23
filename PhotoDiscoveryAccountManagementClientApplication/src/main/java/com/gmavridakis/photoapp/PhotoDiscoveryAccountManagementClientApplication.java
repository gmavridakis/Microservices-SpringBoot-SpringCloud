package com.gmavridakis.photoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PhotoDiscoveryAccountManagementClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoDiscoveryAccountManagementClientApplication.class, args);
		System.out.println("@@@@ App PhotoDiscoveryAccountManagementClientApplication Started");
	}

}
