package main.model;

public class Bike extends Vehicle{
    private String name;

    public Bike(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                '}';
    }
}
