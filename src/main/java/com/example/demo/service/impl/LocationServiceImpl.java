package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

    @Override
    public String getLocationById(Long id) {
        return "Location-" + id;
    }
}
