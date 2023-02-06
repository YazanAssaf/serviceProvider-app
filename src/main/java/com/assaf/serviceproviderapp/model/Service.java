package com.assaf.serviceproviderapp.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(mappedBy = "services", cascade = CascadeType.ALL)
    private List<ServiceProvider> serviceProviderList;
}
