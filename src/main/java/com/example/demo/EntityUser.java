package com.example.demo;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "User")
@Table(name = "users")
public class EntityUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;


    // Getters and Setters
}