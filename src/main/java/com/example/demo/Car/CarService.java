package com.example.demo.Car;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Magda on 23.08.2017.
 */
@Service
public class CarService {
    private List<Car> cars = new ArrayList<>(Arrays.asList(new Car("1", "lanos", "srebrny"),
            new Car("2", "lanos", "czarny"),
            new Car("3", "lanos", "czerwony")));
    public List<Car> getAllCars(){
        return cars;
    }


    public Car getCar(String id){
        return cars.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}
