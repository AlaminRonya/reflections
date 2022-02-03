package main.model;

import main.callbacks.OnCarCompeleted;

public class Car extends Vehicle implements OnCarCompeleted{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
    public void setObject(OnCarCompeleted onCarCompeleted, Car c){
        onCarCompeleted.onCar(c);
    }

    @Override
    public void onCar(Car car) {

    }
}
