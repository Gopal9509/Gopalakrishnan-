package com.crudProject.SpringAngular.CustomerRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.crudProject.SpringAngular.entity.Customer;

@EnableJpaRepositories
@Repository
public interface customerRepo extends JpaRepository<Customer, Integer>{

}
