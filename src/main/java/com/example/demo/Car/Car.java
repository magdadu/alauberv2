package com.example.demo.Car;

/**
 * Created by Magda on 23.08.2017.
 */
public class Car {


    private String id;
    private String name;
    private String description;

    public Car() {

    }

    public Car(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}