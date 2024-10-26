package org.example.electronicdevices;

public class Tablet extends Device{
    public Tablet() {}
    protected  double batteryLife;
    protected boolean hasStylus;
    public Tablet(DeviceType type, String name, double price, double weight, double batteryLife) {
        super(type, name, price, weight);
    }
    public Tablet(DeviceType type, String name, double price, double weight, double batteryLife, boolean hasStylus) {
        super(type, name, price, weight);
        this.batteryLife = batteryLife;
        this.hasStylus = this.hasStylus;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getHasStylus() {
        return String.valueOf(hasStylus);
    }

    public void setHasStylus(String processorType) {
        this.hasStylus = Boolean.parseBoolean(processorType);
    }

    @Override
    public String toString() {
        return "Tablet{" +
                ", name='" + name + '\'' +
                ", price=" + price +
                "batteryLife=" + batteryLife +
                ", processorType='" + hasStylus + '\'' +
                ", type=" + type +
                ", weight=" + weight +
                '}';
    }
}
