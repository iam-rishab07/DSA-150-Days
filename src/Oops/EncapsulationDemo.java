package Oops;

class Vehicle{
    String brand;
    String color;
    int mileage;

    public Vehicle(){

    }
    public Vehicle(String brand, String color, int mileage) {
        this.brand = brand;
        this.color = color;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Toyota","Red",120);
        System.out.println(car.toString());
    }
}
