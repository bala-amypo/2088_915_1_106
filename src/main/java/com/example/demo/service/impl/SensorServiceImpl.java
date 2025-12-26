package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.SensorService;

@Service
public class SensorServiceImpl implements SensorService {

    @Override
    public String getSensorStatus(Long id) {
        return "ACTIVE";
    }
}
