package com.example.employecurd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="stsemployee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String name;
    @Column(unique = true)
    private String email;

    public Employee(int id, String name, String email) {
        Id = id;
        this.name = name;
        this.email = email;
    }

    private String password;
}
