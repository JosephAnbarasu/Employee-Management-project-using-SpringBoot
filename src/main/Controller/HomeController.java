package com.employee.management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String Home() {
		return "Welcome this Home page is Autheticated to All !";
	}
	
    @GetMapping("/admin")
    public String admin(){
        return "This is Admin Page";
    }
}
