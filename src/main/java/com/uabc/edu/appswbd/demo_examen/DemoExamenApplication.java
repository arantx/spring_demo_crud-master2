package com.uabc.edu.appswbd.demo_examen;

import com.uabc.edu.appswbd.demo_examen.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//8@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class DemoExamenApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoExamenApplication.class, args);
    }

}
