package com.home.logic;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.home.dto.User;

public interface UserLogic {

	List<User> getUsers();

	User getUser(int id);

	String createUser(User user);

	String userLoggedIn(HttpServletRequest request);

	void showUserProfileImage(String string, String imageType, HttpServletResponse response);

}
