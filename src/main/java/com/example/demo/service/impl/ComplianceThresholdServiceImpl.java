package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.ComplianceThresholdService;

@Service
public class ComplianceThresholdServiceImpl
        implements ComplianceThresholdService {

    @Override
    public boolean isWithinThreshold(double value, double threshold) {
        return value <= threshold;
    }
}
