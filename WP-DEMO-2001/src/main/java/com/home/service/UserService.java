package com.home.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.home.dto.User;

public interface UserService {

	@GetMapping(value = "/users", headers = "Accept=application/json")
	public String getUsers();

	@GetMapping(value = "/user/{id}", headers = "Accept=application/json")
	public User getUser(@PathVariable("id") int id);

	@PostMapping(value = "/createUser")
	public String createUser(@RequestBody User user);
	
	@PostMapping(value = "/login", headers = "Accept=application/json")
	public String login(@RequestBody String json, HttpServletRequest request);
	
	@PostMapping(value = "/signup")
	public String signup(@RequestBody User user);
	
	public void showUserProfileImage(String imageType, String userId, String fileName,HttpServletResponse response);

}
