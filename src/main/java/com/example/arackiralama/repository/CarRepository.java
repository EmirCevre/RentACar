package com.example.arackiralama.repository;

import com.example.arackiralama.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
