package com.assaf.serviceproviderapp.controller;


import com.assaf.serviceproviderapp.model.Rating;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("api/serviceProviders")
public class ServiceProviderController {
    @GetMapping("{serviceProviderId}/ratings")
    List<Rating> getRatingsForServiceProvider(@PathVariable int serviceProviderId){
        return null;
    }

}
