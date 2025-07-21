package com.example.demo.repositories;

import org.springframework.stereotype.Repository;

import com.example.demo.models.Performance;

import java.time.LocalDateTime;

@Repository
public class PerformanceRepository {
    Performance performance;

    public PerformanceRepository() {
        // TIME
        LocalDateTime currentDateTime = LocalDateTime.now();
        // MEMORY
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory(); 
        long freeMemory = runtime.freeMemory();
        long usedMemory = (totalMemory - freeMemory) / (1024 * 1024); // Convert to MB
        // THREADS
        int activeThreads = Thread.activeCount();

        this.performance = new Performance(currentDateTime.toString(), String.valueOf(usedMemory), activeThreads);
    }
    public Performance getPerformance() {
        return performance;
    }
    public void setPerformance(Performance performance) {
        this.performance = performance;
    }
}
