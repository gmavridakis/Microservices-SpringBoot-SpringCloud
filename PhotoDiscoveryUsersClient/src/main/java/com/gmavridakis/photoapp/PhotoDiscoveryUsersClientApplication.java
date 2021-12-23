package com.gmavridakis.photoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotoDiscoveryUsersClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoDiscoveryUsersClientApplication.class, args);
		System.out.println("@@@@ App PhotoDiscoveryUsersClientApplication Started");
	}

}
