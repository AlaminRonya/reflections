package main.model;

import main.callbacks.OnCarCompeleted;

public  class Vehicle implements OnCarCompeleted {
    private String name;

    public Vehicle() {
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public void show(Vehicle vehicle){
        System.out.println(vehicle.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void onCar(Car car) {
        System.out.println(car);
    }
}
