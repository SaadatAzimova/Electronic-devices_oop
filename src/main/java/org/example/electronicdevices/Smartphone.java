package org.example.electronicdevices;

public class Smartphone extends Device {
    protected double screenSize;
    protected double resolution;

    public Smartphone() {
    }

    public Smartphone(DeviceType type, String name, double price, double weight) {
        super(type, name, price, weight);
    }
    public Smartphone(DeviceType type, String name, double price, double weight, double screenSize, double resolution) {
        super(type, name, price, weight);
        this.screenSize = screenSize;
        this.resolution = resolution;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "screenSize=" + screenSize +
                ", resolution=" + resolution +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
