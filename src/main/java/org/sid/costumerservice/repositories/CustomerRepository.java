package org.sid.costumerservice.repositories;

import org.sid.costumerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@RepositoryRestResource
@CrossOrigin(value = "*",methods = {RequestMethod.GET, RequestMethod.POST})
public interface CustomerRepository extends JpaRepository<Customer,Long> {


}
