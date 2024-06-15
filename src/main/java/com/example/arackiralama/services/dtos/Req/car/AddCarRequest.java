package com.example.arackiralama.services.dtos.Req.car;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AddCarRequest {

    @NotBlank(message = "Boş bırakılamaz.")
    @Size(min = 5 , max = 10, message = "Geçerli bir plaka giriniz.")
    private String plate;

    @NotBlank(message = "Boş bırakılamaz.")
    @Size(min = 2, max = 25, message = "Geçerli bir marka giriniz.")
    private String brand;

    @NotBlank(message = "Boş bırakılamaz.")
    @Pattern(regexp = "^\\d{4}$", message = "Geçerli bir model yılı giriniz.")
    private String model;


    @NotNull(message = "Boş olamaz")
    @DecimalMin(value = "1", message = "Geçerli bir fiyat giriniz")
    private double rentingPrice;

    @NotNull(message = "Boş olamaz")
    @DecimalMin(value = "1", message = "Geçerli bir fiyat giriniz")
    private double salePrice;
}

