package com.assaf.serviceproviderapp.controller;


import com.assaf.serviceproviderapp.model.ServiceProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController("api/services")
public class ServiceController {
    @GetMapping("/{serviceId}/serviceProviders")
    List<ServiceProvider> getServiceProvidersForService(@PathVariable int serviceId){
        return null;
    }
}
