package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.ComplianceEvaluationService;

@Service
public class ComplianceEvaluationServiceImpl
        implements ComplianceEvaluationService {

    @Override
    public boolean evaluateCompliance(double value, double min, double max) {
        return value >= min && value <= max;
    }
}
