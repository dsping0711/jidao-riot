package com.jidao.riot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@Controller
@EnableWebMvc
public class RiotApplication extends WebMvcConfigurerAdapter {
    public static void main(String[] args) {
        SpringApplication.run(RiotApplication.class, args);
    }
}
