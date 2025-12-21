package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "compliance_thresholds", uniqueConstraints = {
        @UniqueConstraint(columnNames = "sensorType")
})
public class ComplianceThreshold {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sensorType;
    private Double minValue;
    private Double maxValue;
    private String severityLevel;
    private LocalDateTime createdAt;

    public ComplianceThreshold() {
        this.createdAt = LocalDateTime.now();
    }

    public ComplianceThreshold(Long id, String sensorType, Double minValue,
                               Double maxValue, String severityLevel,
                               LocalDateTime createdAt) {
        this.id = id;
        this.sensorType = sensorType;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.severityLevel = severityLevel;
        this.createdAt = createdAt;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Strin
