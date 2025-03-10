package com.crudProject.SpringAngular.Service;

import java.util.List;

import com.crudProject.SpringAngular.DTO.CustomerDTO;
import com.crudProject.SpringAngular.DTO.CustomerSaveDTO;
import com.crudProject.SpringAngular.DTO.CustomerUpdateDTO;

public interface CustomerService {

	String addCustomer(CustomerSaveDTO customerSaveDTO);

	List<CustomerDTO> getAllCustomer();

	String updateCustomers(CustomerUpdateDTO customerUpdateDTO);

	boolean deleteCustomer(int id);

}
