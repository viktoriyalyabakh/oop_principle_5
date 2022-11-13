package class_object;

public class Fruit {

    public static boolean hasColor;
    public boolean isSweet;
    public String name;
    public String shape;


    //Instance block executed for each object being created
    {
        System.out.println("This is an instance block");
    }

    //Static block is execute only once and before everything else in the same class
    static {
        hasColor = true;
        System.out.println("This is an static block");
    }
}
