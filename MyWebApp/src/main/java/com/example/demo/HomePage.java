package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePage {
	@RequestMapping("hello")
	public String hello(HttpServletRequest req) {
		HttpSession session = req.getSession();
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		session.setAttribute("fname", fname);
		session.setAttribute("lname", lname);
		return "home";
	}
}
