package com.gmavridakis.webserviceapp.MicroservicesSpringBootSpringCloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UsersController {
	@GetMapping
	public String getUser() {
		return "getUser()";
	}
	@PostMapping
	public String createUser() {
		return "createUser()";
	}
}
