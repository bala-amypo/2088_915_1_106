package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.SensorReadingService;

@Service
public class SensorReadingServiceImpl
        implements SensorReadingService {

    @Override
    public boolean saveReading(double value) {
        return true;
    }
}
