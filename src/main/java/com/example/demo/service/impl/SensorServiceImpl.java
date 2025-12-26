package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Collections;
import com.example.demo.service.SensorService;
import com.example.demo.entity.Sensor;

@Service
public class SensorServiceImpl implements SensorService {

    @Override
    public List<Sensor> getAllSensors() {
        return Collections.emptyList();
    }
}
