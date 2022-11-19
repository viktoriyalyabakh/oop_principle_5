package java_memory_management;

import class_object.Animal;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class UnderstandingGarbageCollection {
    public static void main(String[] args) {

        Animal a1 = new Animal("Cow", 5);
        Animal a2 = new Animal("Dog", 3);
        Animal a3 = new Animal("Cat", 1);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        a1 = a2;
        a3 = null;

        System.gc();//explicitly invoking Garbage collection
        Runtime.getRuntime().gc();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);



    }
}