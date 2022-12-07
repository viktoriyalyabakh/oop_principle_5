package oop_principles.abstraction;

public class TestAbstraction {
    public static void main(String[] args) {

        Samsung s1 = new Samsung();
        s1.call();
        s1.text();

        iPhone i1 = new iPhone();
        i1.call();
        i1.text();

        Samsung s2 = new Samsung(64, "Galaxy 12", "white", 890.99);
        iPhone i2 = new iPhone(64, "iPhone 12", "black", 999.00);

        System.out.println(s2);
        System.out.println(i2);

        s2.takesPhoto();
        s2.recordVideo();
    }
}
