package org.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.websocket.reactive.WebSocketReactiveAutoConfiguration;

import javax.sql.DataSource;

/*
@SpringBootApplication is combination of these annotations:
@EnableAutoConfiguration
@SpringBootConfiguration
@ComponentScan*/
// Dont autoconfigure and create a bean for this class
@SpringBootApplication(exclude = WebSocketReactiveAutoConfiguration.class)
public class SpringBootHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloApplication.class, args);
    }

}
