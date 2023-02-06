package com.assaf.serviceproviderapp.service;

import com.assaf.serviceproviderapp.model.SecurityUser;
import com.assaf.serviceproviderapp.model.User;
import com.assaf.serviceproviderapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JpaUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.
                findByEmail(email).
                map(SecurityUser::new).
                orElseThrow(()->new UsernameNotFoundException("user not found : email "));
    }
}
