package com.assaf.serviceproviderapp.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ServiceProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String phone;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "serviceProvider_service",
            joinColumns =@JoinColumn(name = "serviceProvider_id"),
            inverseJoinColumns = @JoinColumn(name = "service_id")
    )
    private List<Service> serviceList;
    @OneToMany(mappedBy = "serviceProvider")
    private List<Rating> ratingList;
}
