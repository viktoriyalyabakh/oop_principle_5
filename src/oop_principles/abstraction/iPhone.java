package oop_principles.abstraction;

public class iPhone extends Phone  implements Camera, WiFi{

    public iPhone(){}
    public iPhone(int storage, String model, String color, double price) {
        super(storage, model, color, price);
    }

    @Override
    public void call() {
        System.out.println("iPhone way of calling");
    }

    @Override
    public void text() {
        System.out.println("IPhone way of texting");
    }

    @Override
    public void takesPhoto() {
        System.out.println("IPhone way of taking photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("IPhone way of recording video");
    }

    @Override
    public void connect() {
        System.out.println("iPhone way of connecting to WiFi");
    }
}
