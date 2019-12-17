package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/*
 *@SpringBootApplication is to boot strap the application based on application properties , behind the scene it is equivalent to @configuration @EnableAutoConfiguration @ComponentScan
 * SpringBootApplication is to boot strap and launch the application from the main method.It Automatically creates application context from classpath , Scan the Configuration classes and launch the application
 */
@SpringBootApplication

public class DemoApplication {
    @Autowired
private EmpService empService;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println(empService.all());
//    }
}
