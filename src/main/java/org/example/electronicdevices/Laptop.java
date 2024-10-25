package org.example.electronicdevices;

public class Laptop extends Device {
    public Laptop() {}
    protected int ramSize;
    protected String cameraResolution;

    public Laptop(int ramSize) {
        this.ramSize = ramSize;
    }

    public Laptop(DeviceType type, String name, double price, double weight, int ramSize) {
        super(type, name, price, weight);
    }
    public Laptop(DeviceType type, String name, double price, double weight, int ramSize, String cameraResolution) {
        super(type, name, price, weight);
        this.ramSize = ramSize;
        this.cameraResolution = cameraResolution;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(String cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ramSize=" + ramSize +
                ", cameraResolution='" + cameraResolution + '\'' +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
