package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repositories.InvalidTransactionRepository;
import com.example.demo.repositories.TransactionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/blackrock/challenge/v1/returns")
public class ReturController {

    @Autowired
    private TransactionRepository transaccionRepository;

    @Autowired
    private InvalidTransactionRepository invalidTransactionRepository;

    @GetMapping("/ppr")
    public ResponseEntity<?> getPPR() {
        System.out.println("*********** PPR *********** ");
        // Assuming PPR stands for "Post Processing Report"
        // Here you would implement the logic to generate the PPR
        // For now, returning a placeholder response
        return new ResponseEntity<>("Post Processing Report Placeholder", HttpStatus.OK);  
    }

    @GetMapping("ishares")
    public ResponseEntity<?> getIshares() {
        System.out.println("*********** iShares *********** ");
        // Assuming iShares refers to a specific report or data retrieval
        // Here you would implement the logic to retrieve iShares data
        // For now, returning a placeholder response
        return new ResponseEntity<>("iShares Data Placeholder", HttpStatus.OK);
    }
}