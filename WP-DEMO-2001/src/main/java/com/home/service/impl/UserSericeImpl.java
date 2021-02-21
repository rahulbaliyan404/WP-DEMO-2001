package com.home.service.impl;
import org.json.*;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.home.dto.User;
import com.home.logic.UserLogic;
import com.home.service.UserService;

@RestController
@RequestMapping(value = { "/userService" })
//@CrossOrigin(origins = "http://localhost:3000")
public class UserSericeImpl implements UserService {

	@Autowired
	UserLogic userLogic;

	public String getUsers() {
		JSONArray jsonArray = new JSONArray();
		try {
			List<User> users = userLogic.getUsers();
			jsonArray = User.toJson(users);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonArray.toString();
	}

	public User getUser(@PathVariable("id") int id) {
		User user = userLogic.getUser(id);
		return user;
	}

	public String createUser(@RequestBody User user) {
		
		String createUser=null;
		System.out.println("user :::: " +user.getUserName());
		
		//String createUser = userLogic.createUser(user);

		return createUser;
	}

	@Override
	public String login(@RequestBody String json, HttpServletRequest request) {
		User user=new User();
		try {
			JSONTokener jsonTokener = new JSONTokener(json);
			JSONObject jsonObj = new JSONObject(jsonTokener);
			
			if (jsonObj.has("userEmail")) {
				user.setUserEmail(jsonObj.getString("userEmail"));
			}
			if (jsonObj.has("userPassword")) {
				user.setUserPassword(jsonObj.getString("userPassword"));
			}
			System.out.println(user);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		return "created";
	}

	@Override
	public String signup(User user) {
		
		return null;
	}

	@Override
	@RequestMapping(value = "/showUserProfileImage/{imageType}/{userId}/{fileName}", method = RequestMethod.GET)
	public void showUserProfileImage(@PathVariable String imageType,@PathVariable String userId,@PathVariable String fileName,HttpServletResponse response) {
		
		try {
			userLogic.showUserProfileImage(userId+"#"+fileName,imageType,response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
