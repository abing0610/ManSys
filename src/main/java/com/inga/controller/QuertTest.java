package com.inga.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inga.bean.TUser;
import com.inga.service.TUserService;

@Controller
public class QuertTest {
	
	@Resource
	private TUserService userService;


	//测试分页是否可以使用
	@RequestMapping("/helloWorld")
	public String test(HttpServletRequest request, HttpServletResponse  response,
					   Model model){
		String id  = request.getParameter("id");
		String name = request.getParameter("name");

		System.out.println("test");

		List<TUser> list = this.userService.getUserById(id);
		System.out.println("list size : " + list.size());
		model.addAttribute("list", list);

		return "hello";
	}

	@RequestMapping("/queryTest")
	public String hello(@RequestParam String id,@RequestParam String name,
			HttpServletRequest request,HttpServletResponse response ,Model model) {

		List<TUser> list = new ArrayList<TUser>();

		//正常调用，使用了cache
		list = this.userService.getUserById(name);
		
		model.addAttribute("user", list);
		model.addAttribute("name", "1111111111111");
		
		
		return "test/query";
	}
	
	@RequestMapping("/delUser")
	public String delUser(@RequestParam String idlist,
			HttpServletRequest request,HttpServletResponse response ,Model model) {
		
		boolean b = this.userService.delUserById(idlist);
		 
		List<TUser> list = new ArrayList<TUser>();

		//正常调用，使用了cache
		list = this.userService.getUserById("");
		
		model.addAttribute("user", list);

		return "test/query";
	}
	
	
	@RequestMapping("/addUser")
	public String addUser(@RequestParam String id,@RequestParam String name,@RequestParam String password,
			HttpServletRequest request,HttpServletResponse response ,Model model) {
		

		TUser tUser = new TUser();
//		tUser.setId(id);
		tUser.setName(name);
		tUser.setPassword(password);
		
		boolean b = this.userService.addUser(tUser);
		
		System.out.println(" b  : "  + b );
		
		List<TUser> list = new ArrayList<TUser>();

		//正常调用，使用了cache
		list = this.userService.getUserById("");
		
		model.addAttribute("user", list);
		
		
		return "test/query";
	}
}

