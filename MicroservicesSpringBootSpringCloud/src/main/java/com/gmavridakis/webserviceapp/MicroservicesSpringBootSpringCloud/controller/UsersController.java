package com.gmavridakis.webserviceapp.MicroservicesSpringBootSpringCloud.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gmavridakis.webserviceapp.MicroservicesSpringBootSpringCloud.model.UserModel;

@RestController
@RequestMapping("api/users")
public class UsersController {
	@GetMapping
	public ResponseEntity<UserModel> getUsers(@RequestParam(value="page", defaultValue="1") int page,
						   @RequestParam(value="limit", required=true) int limit) {
		UserModel resp = new UserModel();
		resp.setUserId("1");
		resp.setFirstName("Grigorios");
		resp.setLastName("Mavridakis");
		resp.setEmail("greg_mavridakhs@gmail.com");
		return new ResponseEntity<UserModel>(resp,HttpStatus.OK);
	}
	
	@GetMapping(path="/{userId}")
	public String getUser(@PathVariable String userId) {
		return "Hello from getUser() with path variable userId = " +userId;
	}
	
	@PostMapping( consumes = { MediaType.APPLICATION_JSON_VALUE },
				  produces = { MediaType.APPLICATION_JSON_VALUE } )
	public ResponseEntity<UserModel> createUser(@RequestBody UserModel userModel) {
		UserModel resp = userModel;
		return new ResponseEntity<UserModel>(resp,HttpStatus.OK);
	}
}
