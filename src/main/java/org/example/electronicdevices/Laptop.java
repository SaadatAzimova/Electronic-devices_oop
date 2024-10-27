package org.example.electronicdevices;

public class Laptop extends Device {
    public Laptop() {}
    protected int ramSize;
    protected String processorType;

    public Laptop(int ramSize) {
        this.ramSize = ramSize;
    }
//constructors
    public Laptop(DeviceType type, String name, double price, double weight) {
        super(type, name, price, weight);
    }
    public Laptop(DeviceType type, String name, double price, double weight, int ramSize, String processorType) {
        super(type, name, price, weight);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }
//getter and setter methods
    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }
//to string method
    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", price=" + price +"$"+
                ", weight=" + weight +
                ", type=" + type +
                ", ramSize=" + ramSize +
                ", processorType='" + processorType + '\'' +
                '}';
    }
}
