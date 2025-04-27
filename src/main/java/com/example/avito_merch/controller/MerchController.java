package com.example.avito_merch.controller;

import com.example.avito_merch.model.Merch2;
import com.example.avito_merch.service.AllServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class MerchController {
    public final AllServices allservices;

    public MerchController(AllServices allservices) {
        this.allservices = allservices;
    }

    @GetMapping("/allMerch")
    private List<Merch2> allMerch(){
        log.info("GET all Merch");
        return allservices.getAllMerch2();
    }
}
