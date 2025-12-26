package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class SensorReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double value;
    private LocalDateTime timestamp;

    public Long getId() { return id; }
    public double getValue() { return value; }
    public LocalDateTime getTimestamp() { return timestamp; }

    public void setId(Long id) { this.id = id; }
    public void setValue(double value) { this.value = value; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}
