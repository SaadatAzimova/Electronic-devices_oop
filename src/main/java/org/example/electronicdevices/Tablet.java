package org.example.electronicdevices;

public class Tablet extends Device{
    public Tablet() {}
    protected  double batteryLife;
    protected String  processorType;
    public Tablet(DeviceType type, String name, double price, double weight, double batteryLife) {
        super(type, name, price, weight);
    }
    public Tablet(DeviceType type, String name, double price, double weight, double batteryLife, String processorType) {
        super(type, name, price, weight);
        this.batteryLife = batteryLife;
        this.processorType = processorType;
    }
}
