package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    public Long getId() { return id; }
    public String getType() { return type; }

    public void setId(Long id) { this.id = id; }
    public void setType(String type) { this.type = type; }
}
