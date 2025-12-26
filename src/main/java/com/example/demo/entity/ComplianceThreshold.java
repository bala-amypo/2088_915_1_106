package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class ComplianceThreshold {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double maxValue;

    public Long getId() { return id; }
    public double getMaxValue() { return maxValue; }

    public void setId(Long id) { this.id = id; }
    public void setMaxValue(double maxValue) { this.maxValue = maxValue; }
}
