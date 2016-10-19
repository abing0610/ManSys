package com.inga.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.org.apache.regexp.internal.recompile;

/**
 * 登陆controller
 * @author user
 *
 */
@Controller
public class LoginController {

	@RequestMapping("/login")
	public String login(HttpServletRequest request,HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		session.setAttribute("user", "user");
		session.setAttribute("password", "password");
		
		
		return "test/index";
	}
}
