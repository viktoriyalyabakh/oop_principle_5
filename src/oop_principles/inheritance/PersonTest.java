package oop_principles.inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        Tester t1 = new Tester();

        p1.eat();
        t1.eat();

        p1.sleep();
        t1.sleep();


    }
}
