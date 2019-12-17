package com.example.demo;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
/*
 *@setter annotation is indication of  setter methods
 *@Getter annotation is indication  of   getter methods
 *@ToString annotation is indication of ToString method
 *@componet is indication of component class
 *@value is an interface which is used to set a value
 *
 *
 *
 */

@Data
public class Employee {

    private String name;
    private String email;

    public Employee() {
    }

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
