package com.home.controller.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.home.controller.UserController;
import com.home.dto.User;
import com.home.logic.UserLogic;

@Controller
public class UserControllerImpl implements UserController {

	@Autowired
	UserLogic userLogic;

	@Override
	public ModelAndView loadUserSignupScreen() {

		return new ModelAndView("/login");
	}

	public String saveUserData(@ModelAttribute("user") User user, HttpServletRequest request) {

		return null;
	}

	@Override
	public ModelAndView loadUserLoginScreen() {
		return new ModelAndView("/login");
	}

	@Override
	public ModelAndView userLoggedIn() {
//		String status=userLogic.userLoggedIn(request);
		return new ModelAndView("/home");
	}

	@Override
	public ModelAndView loadHomeScreen() {
		return new ModelAndView("/home");
	}

	@Override
	public ModelAndView loadPieChartDataScreen() {
		return new ModelAndView("/charts-chartjs");
	}

	@Override
	public ModelAndView formsLayoutDataScreen() {

		return new ModelAndView("/forms-layouts");
	}

	@Override
	public ModelAndView formValidationDataScreen() {
		// TODO Auto-generated method stub
		return new ModelAndView("/forms-validation");
	}

}
