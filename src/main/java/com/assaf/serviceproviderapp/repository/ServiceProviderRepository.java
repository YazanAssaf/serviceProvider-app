package com.assaf.serviceproviderapp.repository;

import com.assaf.serviceproviderapp.model.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ServiceProviderRepository extends JpaRepository<ServiceProvider,Integer> {
    List<ServiceProvider> findByServiceId(int serviceId);
}
