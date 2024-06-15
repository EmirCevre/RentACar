package com.example.arackiralama.services.concretes;

import com.example.arackiralama.entities.Car;
import com.example.arackiralama.repository.CarRepository;
import com.example.arackiralama.services.abstracts.CarService;
import com.example.arackiralama.services.dtos.Req.car.AddCarRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarServiceImpl implements CarService
{
   // Burada işlem yapmak için car'ın deposunu getirmemiz gerekiyor.
    private CarRepository carRepository;
    @Override
    public String add(AddCarRequest request) {
        Car car = new Car();
        car.setBrand(request.getBrand());
        car.setPlate(request.getPlate());
        car.setModel(request.getModel());
        car.setRentingPrice(request.getRentingPrice());
        car.setSalePrice(request.getSalePrice());

        //car reposunu car'ı kaydetmek için çağırmıştık
        carRepository.save(car);

        return "Başarıyla eklendi.";
    }
}
