package com.example.arackiralama.controller;

import com.example.arackiralama.services.abstracts.CarService;
import com.example.arackiralama.services.dtos.Req.car.AddCarRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("car")
@AllArgsConstructor
public class CarController
{
    private CarService carService;

    @PostMapping ("post")
    @ResponseStatus(HttpStatus.CREATED)
    public String post(@RequestBody @Valid AddCarRequest request){
       // Buradaki add önce car serviceden oradan önce de carserviceımpldan geliyor.
        return carService.add(request);
    }
}
