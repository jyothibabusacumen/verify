package com.example.demo;

import javafx.beans.binding.When;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.AssertEquals.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ContextConfiguration(classes = Controller.class)
@AutoConfigureMockMvc
public class testController {

@Autowired
   private MockMvc mockMvc;
@Autowired
private Controller controller;
@MockBean
   private EmpService empService;
@Test
    void test_controller(){
    when(controller.all()).thenReturn("jyothibabu","j")
}
}
