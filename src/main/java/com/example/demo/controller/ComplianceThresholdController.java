package com.example.demo.controller;

import com.example.demo.entity.ComplianceThreshold;
import com.example.demo.service.ComplianceThresholdService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/thresholds")
public class ComplianceThresholdController {

    private final ComplianceThresholdService thresholdService;

    public ComplianceThresholdController(ComplianceThresholdService thresholdService) {
        this.thresholdService = thresholdService;
    }

    @PostMapping
    public ComplianceThreshold create(@RequestBody ComplianceThreshold threshold) {
        return thresholdService.createThreshold(threshold);
    }

    @GetMapping
    public List<ComplianceThreshold> getAll() {
        return thresholdService.getAllThresholds();
    }

    @GetMapping("/{id}")
    public ComplianceThreshold getById(@PathVariable Long id) {
        return thresholdService.getThreshold(id);
    }

    @GetMapping("/type/{sensorType}")
    public ComplianceThreshold getByType(@PathVariable String sensorType) {
        return thresholdService.getThresholdBySensorType(sensorType);
    }
}
