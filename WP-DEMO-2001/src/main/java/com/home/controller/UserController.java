package com.home.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.home.dto.User;

public interface UserController {

	@RequestMapping("/")
	public ModelAndView loadUserLoginScreen();

	@RequestMapping(value = "/getLoggedIn", method = RequestMethod.GET)
	public ModelAndView userLoggedIn();

	@RequestMapping("/signup")
	public ModelAndView loadUserSignupScreen();

	@RequestMapping(value = "/saveDataAction", method = RequestMethod.POST)
	public String saveUserData(@ModelAttribute("user") User user, HttpServletRequest request);

	@RequestMapping("/home")
	public ModelAndView loadHomeScreen();

	@RequestMapping("/loadPieChartData")
	public ModelAndView loadPieChartDataScreen();

	@RequestMapping("/formsLayoutData.html")
	public ModelAndView formsLayoutDataScreen();

	@RequestMapping("/formValidationData.html")
	public ModelAndView formValidationDataScreen();
}
