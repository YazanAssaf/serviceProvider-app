package com.assaf.serviceproviderapp.repository;

import com.assaf.serviceproviderapp.model.Service;
import com.assaf.serviceproviderapp.model.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Service,Integer> {

}
