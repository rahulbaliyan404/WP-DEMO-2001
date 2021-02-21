package com.home.dto;

import java.io.Serializable;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userId;
	private String userName;
	private String userPassword;
	private String userEmail;
	private double userSalary;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public double getUserSalary() {
		return userSalary;
	}

	public void setUserSalary(double userSalary) {
		this.userSalary = userSalary;
	}

	public static JSONArray toJson(List<User> users) {
		JSONArray jsonArray = new JSONArray();
		users.forEach(jsonObjects -> {
			try {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("userId", jsonObjects.getUserId());
				jsonObject.put("userName", jsonObjects.getUserName());
				jsonObject.put("userPassword", jsonObjects.getUserPassword());
				jsonObject.put("userEmail", jsonObjects.getUserEmail());
				jsonObject.put("userSalary", jsonObjects.getUserSalary());
				jsonArray.put(jsonObject);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		return jsonArray;
	}
}
