package org.sid.costumerservice;

import org.sid.costumerservice.entities.Customer;
import org.sid.costumerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CostumerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CostumerServiceApplication.class, args);
    }
@Bean
    CommandLineRunner start(CustomerRepository customerRepository, RepositoryRestConfiguration repositoryRestConfiguration){
       repositoryRestConfiguration.exposeIdsFor(Customer.class);
        return args -> {
            customerRepository.save(new Customer(null,"mohammed","ou.medux@gmail.com"));
            customerRepository.save(new Customer(null,"hasan","hassan1@gmail.com"));
            customerRepository.save(new Customer(null,"oubada","oubadaalkahf.5@gmail.com"));
        customerRepository.findAll().forEach(c->{
            System.out.println(c.getName());
        });
        };
    }
}
