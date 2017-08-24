package com.example.demo.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Magda on 23.08.2017.
 */

@RestController
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping("/cars")
    public List<Car> getAllCars() {

        return carService.getAllCars();
    }

    @RequestMapping("/cars/{id}")
    public Car getCar(@PathVariable String id) {
        return carService.getCar(id);
    }
    @RequestMapping(method = RequestMethod.POST,value="/cars"  )
    public void addCar(@RequestBody Car car){
        carService.addCar(car);
    }

}
