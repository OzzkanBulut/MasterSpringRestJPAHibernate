package org.demo._020_EazySchoolApplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.SecurityConfigurer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ProjectSecurityConfig {
//    @Bean // Allows any request
//    public SecurityFilterChain securityFilterChain (HttpSecurity httpSecurity) throws Exception{
//        httpSecurity.
//                authorizeHttpRequests((authz) -> authz
//                        .anyRequest().permitAll()
//                ).httpBasic(Customizer.withDefaults());
//        return httpSecurity.build();
//    }

    //    @Bean DENIES EVERY REQUEST EVEN THOUGH YOU ARE AUTHORIZED
//    public SecurityFilterChain securityFilterChain (HttpSecurity httpSecurity) throws Exception{
//        httpSecurity.
//                authorizeHttpRequests((authz) -> authz
//                        .anyRequest().denyAll()
//                ).httpBasic(Customizer.withDefaults());
//        return httpSecurity.build();
//    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user1 = User.withUsername("user")
                .password(passwordEncoder().encode("12345"))
                .roles("USER")
                .build();
        UserDetails user2 = User.withUsername("admin")
                .password(passwordEncoder().encode("54321"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user1, user2);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> auth
                        .requestMatchers("/assets/**").permitAll()
                        .requestMatchers("/home").authenticated()
                        .requestMatchers("/contact").permitAll()
                        .requestMatchers("/courses").permitAll()
                        .requestMatchers("/about").permitAll()
                        .requestMatchers("/holidays/**").permitAll())
                        .formLogin(Customizer.withDefaults());
        return http.build();

    }

//    @Bean
//    public InMemoryUserDetailsManager configure(AuthenticationManagerBuilder auth) throws Exception {
//        User.UserBuilder users = User.withDefaultPasswordEncoder();
//        UserDetails user = users.
//                username("user")
//                .password("12345")
//                .roles("USER")
//                .build();
//        UserDetails admin = users.
//                username("admin")
//                .password("54321")
//                .roles("ADMIN","USER")
//                .build();
//
//        return new InMemoryUserDetailsManager(user, admin);
//    }


}
