package oop_principles.encapsulation;

public class Test {
    public static void main(String[] args) {
        AccountHolder accountHolder = new AccountHolder();

        //accountHolder.firstName = "John";
        //System.out.println(accountHolder.firstName);

        accountHolder.setFirstName("John", "1234");
        System.out.println(accountHolder.getFirstName("5555"));


    }
}
