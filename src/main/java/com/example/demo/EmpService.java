package com.example.demo;

import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
 * initializing the constant values to employee class
 *
 */
@ Service
public class EmpService {

            //    public  static final String name = "jyothibabu";
//    public static final String email = "j@gmail.com";
private List<Employee> e= new ArrayList(Arrays.asList(new Employee("jyothibabu","j@gmail.com")
            ,              new Employee("jyothi","b@gmail.com")));

    public List<Employee> getall() {
        return e;
    }

    public Employee getbyid(String employee) {
        return e.stream().filter(t-> t.getName().equals(employee)).findFirst().get();
    }

    public  void postEmployee( Employee employee){
             e.add(employee);
}


}
