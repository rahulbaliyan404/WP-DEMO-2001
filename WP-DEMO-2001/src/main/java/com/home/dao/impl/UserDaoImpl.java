package com.home.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.home.dao.UserDao;
import com.home.dto.User;
import com.home.utils.DBconnection;

@Repository
public class UserDaoImpl implements UserDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserDaoImpl.class);

	@Override
	public List<User> getUsers() {
		List<User> users = new ArrayList<User>();
		try {
			String sql = "SELECT * FROM user";
			Connection connection = DBconnection.getDBconnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setUserId(rs.getInt("Id"));
				user.setUserName(rs.getString("Name"));
				user.setUserPassword(rs.getString("Password"));
				user.setUserEmail(rs.getString("Email"));
				user.setUserSalary(rs.getInt("Salary"));
				users.add(user);
			}

			return users;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User getUser(int id) {
		User user = new User();
		try {
			Connection connection = DBconnection.getDBconnection();
			String sql = "SELECT * FROM user WHERE Id=" + id;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			rs.next();
			user.setUserId(rs.getInt("Id"));
			user.setUserName(rs.getString("Name"));
			user.setUserPassword(rs.getString("Password"));
			user.setUserEmail(rs.getString("Email"));
			return user;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String createUser(User user) {
		try {
			Connection connection = DBconnection.getDBconnection();
			String sql = "INSERT INTO user(Name,Password,Email) VALUES(?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getUserPassword());
			preparedStatement.setString(3, user.getUserEmail());
			preparedStatement.execute();
			return "200";
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "300";
	}

	@Override
	public String userLoggedIn(User user) {
		LOGGER.info("UserDaoImpl : userLoggedIn :::: Start");
		String status = "300";
		try {
			User userData = new User();
			Connection connection = DBconnection.getDBconnection();
			String sql = "SELECT Name,Password FROM user WHERE Name=" + "'" + user.getUserName() + "'" + " and "
					+ user.getUserPassword();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			rs.next();
			userData.setUserName(rs.getString("Name"));
			userData.setUserPassword(rs.getString("Password"));
			if (userData != null) {
				status = "200";
				return status;
			}

		} catch (Exception e) {
			LOGGER.error("UserDaoImpl : userLoggedIn :::: Exception", e);
		}
		LOGGER.info("UserDaoImpl : userLoggedIn :::: End");
		return status;
	}

}
