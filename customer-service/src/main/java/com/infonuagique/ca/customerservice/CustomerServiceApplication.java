package com.infonuagique.ca.customerservice;

import com.infonuagique.ca.customerservice.entities.Customer;
import com.infonuagique.ca.customerservice.repo.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.saveAll(List.of(
					Customer.builder().name("Arnold TCHUISSEU").email("arnold@gmail.com").build(),
					Customer.builder().name("Mamadou MOUSSA").email("moussa@gmail.com").build(),
					Customer.builder().name("Amine BARRAK").email("amine@gmail.com").build()
			));
			customerRepository.findAll().forEach(System.out::println);
		};
	}

}
