package com.example.avito_merch.controller;

import com.example.avito_merch.model.Employee2;
import com.example.avito_merch.service.AllServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class EmployeeController {
    public final AllServices allservices;

    public EmployeeController(AllServices allservices) {
        this.allservices = allservices;
    }

    @GetMapping("/allEmployee")
    private List<Employee2> allEmployees2(){
        log.info("GET all employee");
        return allservices.getAllEmployee2();
    }
}
