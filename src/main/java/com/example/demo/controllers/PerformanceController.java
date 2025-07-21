package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.demo.repositories.PerformanceRepository;

@RestController
@RequestMapping("/blackrock/challenge/v1/performance")
public class PerformanceController {

    @Autowired
    private PerformanceRepository performanceRepository;

    @GetMapping
    public ResponseEntity<?> performance() {
        System.out.println("*********** performance *********** ");
        return new ResponseEntity<>(performanceRepository.getPerformance(), HttpStatus.OK);  
    }

}
