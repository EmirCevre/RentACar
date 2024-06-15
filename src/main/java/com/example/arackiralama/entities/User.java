package com.example.arackiralama.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firsName;

    private String surName;

    private String phone;

    private String email;

    private String password;

    private String address;

    private Role role;

    @ManyToMany(mappedBy = "users")
    private List<Rent> rents;

}
