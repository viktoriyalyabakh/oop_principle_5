package class_object;

public class Apple {

    //default constructor that provided by Java to create zero arg object
    public Apple(){
      //each time you created a new object, this block will be executed
        System.out.println("This is a default constructor");
    }
    public String color;//null
    public double price;//0.0
    public String taste;//null

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}

