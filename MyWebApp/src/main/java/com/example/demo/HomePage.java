package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomePage {
	@RequestMapping("welcome")
	public String WelcomePage(HttpServletRequest req) {
		HttpSession session = req.getSession();
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		if(fname == null && lname == null) {
			String name = req.getParameter("name");
			session.setAttribute("name", name);
		}
		else {
			session.setAttribute("fname", fname);
			session.setAttribute("lname", lname);
		}
		return "welcome";
	}
	
}
