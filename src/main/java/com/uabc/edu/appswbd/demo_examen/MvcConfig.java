package com.uabc.edu.appswbd.demo_examen;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {

        //registry.addViewController("/createEmployee").setViewName("add-edit-employee");
        registry.addViewController("/").setViewName("list-employees");
        registry.addViewController("/login").setViewName("login");
        //registry.addViewController("/principal").setViewName("list-employees");
    }

}
