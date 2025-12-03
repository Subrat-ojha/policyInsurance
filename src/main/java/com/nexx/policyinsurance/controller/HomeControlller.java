package com.nexx.policyinsurance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeControlller {

	@GetMapping("/")
	public String getHome(HttpServletRequest req) {
		return "Nexx here"+req.getSession().getId();
		}
}
