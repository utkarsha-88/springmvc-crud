package com.coforge.training.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coforge.training.crm.model.Customer;
import com.coforge.training.crm.service.CustomerService;

@Controller
@RequestMapping("/customer") //Class Level Mapping
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	//When there is a Database Interaction Following is the Flow
	//Request -> Controller -> Service -> DAO -> Database
	//Database -> DAO -> Service -> Controller -> Views(Response)
	
	//To Display View Only
	//Request -> Controller ->Views(Response)
	
	@GetMapping("/showForm")  //Method Level Mapping
	public String showFormForAdd(ModelMap theModel) {
	Customer theCustomer = new Customer();
	theModel.addAttribute("customer", theCustomer); 
	
	return "customer-form"; //Return View & Customer Object
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		customerService.saveCustomer(theCustomer);
		
		return "redirect:/customer/list"; //Redirection to List
	}
	

	@GetMapping("/list") // @GetMapping - method level , default GET method
	public String listCustomers(ModelMap theModel) {
		List<Customer> theCustomers = customerService.getCustomers();
		theModel.addAttribute("customers", theCustomers);

		return "list-customers"; // customers attributes is added to view & returned
	}
	
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("customerId") int theId,
			ModelMap theModel) 
	{
		Customer theCustomer = customerService.getCustomer(theId);
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}
	
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId) {
		
		customerService.deleteCustomer(theId);
		return "redirect:/customer/list";
	}
	
	








	

}
