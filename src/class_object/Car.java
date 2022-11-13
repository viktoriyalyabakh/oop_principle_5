package class_object;

public class Car {
    public Car(){

    }

    //overloaded constructor with 5 args
    public Car(String color, String make, String model, int year, double price) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Instance variables
    public String color;
    public String make;
    public String model;
    public int year;
    public double price;

    //override toString method

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
