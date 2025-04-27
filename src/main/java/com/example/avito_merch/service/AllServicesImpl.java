package com.example.avito_merch.service;


import com.example.avito_merch.model.Employee2;
import com.example.avito_merch.model.Merch2;
import com.example.avito_merch.repo.EmployeeRepository;
import com.example.avito_merch.repo.MerchRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AllServicesImpl implements AllServices {
   final private EmployeeRepository employeeRepository;
   final private MerchRepository merchRepository;

    public AllServicesImpl(EmployeeRepository employeeRepository, MerchRepository merchRepository) {
        this.employeeRepository = employeeRepository;
        this.merchRepository = merchRepository;
    }

    @Override
    public List<Employee2> getAllEmployee2() {
        List<Employee2> employeeList = employeeRepository.findAll();
        log.info("employeeList : {}", employeeList);
        return employeeList;
    }

    @Override
    public List<Merch2> getAllMerch2() {
        List<Merch2> merchList = merchRepository.findAll();
        log.info("merchList : {}", merchList);
        return merchList;
    }
}
