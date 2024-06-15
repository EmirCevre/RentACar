package com.example.arackiralama.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "rents")

public class Rent
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDate rentalDate;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;



    @ManyToMany
    @JoinTable(
            name = "rent_user",
            joinColumns = @JoinColumn(name = "rent_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> users;



}
