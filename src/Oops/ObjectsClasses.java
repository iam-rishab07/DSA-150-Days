package Oops;

class Car{
    private String brand;
    private String color;
    private int speed;

    public Car(){}
    public Car(String brand,String color,int speed)
    {
        this.brand=brand;
        this.color=color;
        this.speed=speed;
    }
    public void drive()
    {
        System.out.println("The "+color+" "+brand+" car is driving at "+speed+" kmph");
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
public class ObjectsClasses {
    public static void main(String[] args) {
        Car car = new Car("Hyundai","Red",40);
        System.out.println("Car Brand : "+car.getBrand());
        System.out.println("Car Color : "+car.getColor());
        System.out.println("Car Speed : "+car.getSpeed());
        car.drive();
    }
}
