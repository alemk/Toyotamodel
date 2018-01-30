package com.toyota.model;

public class Vehicle {
    public int speed;
    public String accelerate;

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }

    public String getAccelerate() {
        return accelerate;
    }

    public void setAccelerate(String accelerate) {
        this.accelerate = accelerate;
    }

    public String stop()
    {
        return "vehicle stopped";
    }
    public String start()
    {
        return "vehicle start";
    }


}
