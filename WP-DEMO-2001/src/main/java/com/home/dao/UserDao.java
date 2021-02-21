package com.home.dao;

import java.util.List;

import com.home.dto.User;

public interface UserDao {

	List<User> getUsers();

	User getUser(int id);

	String createUser(User user);

	String userLoggedIn(User user);

}
