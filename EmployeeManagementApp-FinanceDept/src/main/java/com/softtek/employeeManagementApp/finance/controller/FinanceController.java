package com.softtek.employeeManagementApp.finance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FinanceController {
	
	@RequestMapping("/")
	public String launchHomePage() {
		return "welcome";
	}
	
	@GetMapping("/register")
	public String showStudentFormPage() {
		// return LVN (form page-student_registration.jsp)
		return "employeeRegistration";
	}
}
