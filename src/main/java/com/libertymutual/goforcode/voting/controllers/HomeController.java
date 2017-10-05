package com.libertymutual.goforcode.voting.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.libertymutual.goforcode.voting.repositories.ProjectRepo;
import com.libertymutual.goforcode.voting.repositories.UserRepo;

@RestController
@Controller
@RequestMapping("/") 
public class HomeController {
	
	private UserRepo userRepo;
	private ProjectRepo projectRepo;

	public HomeController(UserRepo userRepo, ProjectRepo projectRepo) {
		this.userRepo = userRepo; 
		this.projectRepo = projectRepo; 
	}
	
	@GetMapping("")
	public ModelAndView showHome() {
		ModelAndView mv = new ModelAndView("home/home");		
		return mv; 
	}
	
	@PostMapping("/vote")
	public ModelAndView showProjects() {
		ModelAndView mv = new ModelAndView("home/projects");
		return mv; 
	}
	
	

}
