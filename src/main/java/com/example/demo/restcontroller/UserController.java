package com.example.demo.restcontroller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
	
	@RequestMapping("/api/user")
	public Principal user(Principal user) {
		return user;
	}
}
