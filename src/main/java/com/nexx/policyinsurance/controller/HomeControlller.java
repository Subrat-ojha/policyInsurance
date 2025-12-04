package com.nexx.policyinsurance.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
@Tag(name = "Home Controller", description = "APIs for home and customer management")
public class HomeControlller {
	List<Customer> customer=new ArrayList<Customer>(
			List.of(new Customer("subrat","subemail","address")));
	Customer customerr=new Customer();
	@Operation(summary = "Get welcome message", description = "Returns a welcome message with the session ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved welcome message",
                     content = @Content(schema = @Schema(implementation = String.class)))
    })
    @GetMapping("/")
    public String getHome(HttpServletRequest req) {
		return "Nexx here"+req.getSession().getId();
		}
	
	@Operation(summary = "Add a new customer", description = "Adds a new customer to the system")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully added customer",
                     content = @Content(schema = @Schema(implementation = Customer.class))),
        @ApiResponse(responseCode = "400", description = "Invalid input")
    })
    @PostMapping("/cust")
    public Customer addStudent(
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                description = "Customer object that needs to be added",
                required = true,
                content = @Content(schema = @Schema(implementation = Customer.class))
            )
            @RequestBody Customer customerrr) {
		 customer.add(customerrr);
		 return customerrr;
		}
	
	@Operation(summary = "Get all customers", description = "Returns a list of all customers")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved list of customers",
                     content = @Content(schema = @Schema(implementation = Customer.class, type = "array")))
    })
    @GetMapping("/custall")
    public List<Customer> getAllCust() {
		 return customer;
		}
	
	@Operation(summary = "Get CSRF token", description = "Returns the current CSRF token for security")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved CSRF token")
    })
    @GetMapping("/csrftoken")
    public CsrfToken getCsrf(HttpServletRequest req) {
		 return (CsrfToken) req.getAttribute("_csrf");
		}
}
