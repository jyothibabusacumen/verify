package com.example.demo;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
/*
 *Request handler class to create request url and http methods
 *
 * @RestController is used to create Restfull web services using spring mvc
 *
 */
@RestController
public class Controller {
// create instance of employee class
    @Autowired
private EmpService empService;

    @GetMapping("/all/getallemployee")
//    method to return employee details
    public List<Employee> all(){
        return empService.getall();
    }

    @GetMapping("/{employee}/getbyid")
    public Employee getbyid(@PathVariable String employee , @RequestParam(value= "page") int page, @RequestParam(value = "count") int count){
        return empService.getbyid(employee);
    }

@PostMapping("/{addemployee}/new employee")
 public void postEmployee(@RequestBody Employee employee ){
       empService.postEmployee(employee);
 }

}
