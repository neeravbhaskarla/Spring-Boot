package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.dao.AlienRepo;
import com.example.demo.*;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/fetchAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		ModelAndView mv = new ModelAndView("info.jsp");
		Alien alien = repo.findById(aid).orElse(new Alien());
		mv.addObject("alienInfo", alien);
		System.out.println(repo.getByAname("Neerav"));
		System.out.println(repo.getByAlang("GT"));
		System.out.println(repo.getByAidGreaterThan(101));
		System.out.println(repo.SortDataAccName());
		return mv;
	}
}
