package main.model;

import main.callbacks.OnCarCompeleted;

public class CarObject {
    private OnCarCompeleted onCarCompeleted;
    public void setOnCarCompeleted(OnCarCompeleted carCompeleted){
        this.onCarCompeleted = carCompeleted;
    }
    public void show(){
        System.out.println(onCarCompeleted);
    }

}
