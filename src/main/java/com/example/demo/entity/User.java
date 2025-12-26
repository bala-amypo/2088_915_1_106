package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    private String password;
    private String role;

    public User() {}

    public User(String email, String password, Enum<?> role) {
        this.email = email;
        this.password = password;
        this.role = role.toString();
    }

    // getters & setters
}
