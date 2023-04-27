package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
public class DemoController {
	@RequestMapping("/greet")
	@ResponseBody
	public String abc() {
		return "Welcome to Spring Web MVC";
	}
	
	@RequestMapping("/")
	public String login() {
		return "login.html";
	}
	@RequestMapping("/verify")
	public String verifyUser(@RequestParam("user")String user,@RequestParam("pwd")String password,HttpSession session) {
		System.out.println(user+"->"+password);
		session.setAttribute("fullname","Mr./Mrs./Ms. "+user);
		return "welcome.jsp";
	}
	@RequestMapping("/mv")
	public String loginModelAndView() {
		return "loginmv.html";
	}
	@RequestMapping("/verifyModeAndView")
	public ModelAndView verifyUserModelAndView(@RequestParam("user")String user,@RequestParam("pwd")String password,HttpSession session) {
		ModelAndView mv=new ModelAndView();
		System.out.println("In ModelAndView");
		System.out.println(user+"->"+password);
		session.setAttribute("fullname","Mr./Mrs./Ms. "+user);
		mv.addObject("user","Mr."+user);
		mv.setViewName("welcome.jsp");
		return mv;
	}
}
