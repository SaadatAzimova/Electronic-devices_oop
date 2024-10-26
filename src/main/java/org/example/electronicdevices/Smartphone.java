package org.example.electronicdevices;

public class Smartphone extends Device {
    protected double screenSize;
    protected double cameraResolution;

    public Smartphone() {
    }

    public Smartphone(DeviceType type, String name, double price, double weight) {
        super(type, name, price, weight);
    }
    public Smartphone(DeviceType type, String name, double price, double weight, double screenSize, double cameraResolution) {
        super(type, name, price, weight);
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getResolution() {
        return cameraResolution;
    }

    public void setResolution(double resolution) {
        this.cameraResolution = resolution;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", weight=" + weight +
                "screenSize=" + screenSize +
                ", resolution=" + cameraResolution +
                '}';
    }
}
