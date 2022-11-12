package class_object;

public class AppleTest {
    public static void main(String[] args) {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        System.out.println(apple1);//location
        System.out.println(apple2);//loation

        System.out.println("-------Apple 1-------");
        System.out.println(apple1.color);
        System.out.println(apple1.price);
        System.out.println(apple1.taste);

        System.out.println("-------Apple 2-------");
        apple2.color = "Green";
        apple2.price = 2.4;
        apple2.taste = "sour";
        System.out.println(apple2.color);
        System.out.println(apple2.price);
        System.out.println(apple2.taste);
    }

}
