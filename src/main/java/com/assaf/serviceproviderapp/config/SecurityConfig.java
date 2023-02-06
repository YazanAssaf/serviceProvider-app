package com.assaf.serviceproviderapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig{
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private RsaProperties rsaProperties;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.
                    cors(cors->cors.disable()).
                    authorizeHttpRequests(auth->auth.anyRequest().authenticated()).
                    oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt).
                    sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).
                    userDetailsService(userDetailsService).
                    httpBasic(Customizer.withDefaults()).
                    build();
    }
    @Bean
    JwtDecoder jwtDecoder(){
        return NimbusJwtDecoder.withPublicKey(rsaProperties.publicKey()).build();
    }


}
