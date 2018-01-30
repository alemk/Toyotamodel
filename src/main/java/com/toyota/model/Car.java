package com.toyota.model;

public class Car extends Vehicle{
    private String color;
    private String model;
    public Car(){}

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor()
    {
        return this.color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }


}
