package org.example.electronicdevices;

public class Device {
    protected DeviceType type;
    protected String name;
    protected double price;
    protected double weight;

    public Device(){}
//constructor
    public Device(DeviceType type, String name, double price, double weight) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
//getter and setter methods
    public DeviceType getType() {
        return type;
    }

    public void setType(DeviceType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
