package main.model;

public class User implements GetBike {
    private Vehicle vehicle;

    public User(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String getName() {
        return null;
    }
}
