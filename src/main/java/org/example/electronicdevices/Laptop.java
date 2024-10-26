package org.example.electronicdevices;

public class Laptop extends Device {
    public Laptop() {}
    protected int ramSize;
    protected String processorType;

    public Laptop(int ramSize) {
        this.ramSize = ramSize;
    }

    public Laptop(DeviceType type, String name, double price, double weight, int ramSize) {
        super(type, name, price, weight);
    }
    public Laptop(DeviceType type, String name, double price, double weight, int ramSize, String processorType) {
        super(type, name, price, weight);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String cameraResolution) {
        this.processorType = processorType;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                ", name='" + name + '\'' +
                ", price=" + price +
                "ramSize=" + ramSize +
                ", cameraResolution='" + processorType + '\'' +
                ", type=" + type +
                ", weight=" + weight +
                '}';
    }
}
