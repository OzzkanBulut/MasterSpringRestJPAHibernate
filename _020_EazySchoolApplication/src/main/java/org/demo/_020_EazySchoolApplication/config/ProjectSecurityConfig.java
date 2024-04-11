package org.demo._020_EazySchoolApplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
    @Bean // Allows any request
    public SecurityFilterChain securityFilterChain (HttpSecurity httpSecurity) throws Exception{
        httpSecurity.
                authorizeHttpRequests((authz) -> authz
                        .anyRequest().permitAll()
                ).httpBasic(Customizer.withDefaults());
        return httpSecurity.build();
    }

//    @Bean DENIES EVERY REQUEST EVEN THOUGH YOU ARE AUTHORIZED
//    public SecurityFilterChain securityFilterChain (HttpSecurity httpSecurity) throws Exception{
//        httpSecurity.
//                authorizeHttpRequests((authz) -> authz
//                        .anyRequest().denyAll()
//                ).httpBasic(Customizer.withDefaults());
//        return httpSecurity.build();
//    }

}
