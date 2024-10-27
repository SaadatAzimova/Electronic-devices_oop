package org.example.electronicdevices;

public class Tablet extends Device{
    public Tablet() {}
    protected  double batteryLife;
    protected boolean hasStylus;
    //constructors
    public Tablet(DeviceType type, String name, double price, double weight) {
        super(type, name, price, weight);
    }
    public Tablet(DeviceType type, String name, double price, double weight, double batteryLife, boolean hasStylus) {
        super(type, name, price, weight);
        this.batteryLife = batteryLife;
        this.hasStylus = hasStylus;
    }
//getter and setter methods
    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getHasStylus() {
        return String.valueOf(hasStylus);
    }

    public void setHasStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }
//to string methods
    @Override
    public String toString() {
        return "Tablet{" +
                ", name='" + name + '\'' +
                ", price=" + price + "$"+
                ", weight=" + weight +
                ", type=" + type +
                "batteryLife=" + batteryLife +
                ", hasStylus=" + hasStylus +

                '}';
    }
}
