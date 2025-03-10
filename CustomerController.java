package com.crudProject.SpringAngular.CustomerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudProject.SpringAngular.DTO.CustomerDTO;
import com.crudProject.SpringAngular.DTO.CustomerSaveDTO;
import com.crudProject.SpringAngular.DTO.CustomerUpdateDTO;
import com.crudProject.SpringAngular.Service.CustomerService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping(path="/save")
	public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO) {
		String id=customerService.addCustomer(customerSaveDTO);
		return id;
	}
	
	@GetMapping(path="/getAllCustomer")
	public List<CustomerDTO> getAllCustomer(){
		List<CustomerDTO>allCustomer = customerService.getAllCustomer();
		return allCustomer;
	}
	@PostMapping(path="/update")
	public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO) {
		String id=customerService.updateCustomers(customerUpdateDTO);
		return id;
	}
	@DeleteMapping(path="/deletecustomer/{id}")
	public String deleteCustomer(@PathVariable(value = "id")int id) {
		boolean deletecuatomer = customerService.deleteCustomer(id);
		return "deleted";
	}
}
