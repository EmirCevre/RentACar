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
@Table(name = "cars")

public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String plate;

    private String brand;

    private String model;

    private double rentingPrice;

    private double salePrice;

    @OneToMany(mappedBy ="car" )
    private List<Rent> rents;

}
