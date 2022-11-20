package mutible_immutable;

public class ReverseString {

    /*
    Write a method that takes a String and returns it back reversed

    Hello -> olleH
    Java -> avaJ
      ->
    a  -> a
    1234 -> 4321
    Good morning -> gninrom dooG


    Hello

    Result

    o
    ol
    oll
    olle
    olleH

    result
    olleH
     */

    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }


    public static boolean isPalindrome(String str){
        //return new StringBuilder(str).reverse().toString().equals(str);
        return str.equals(new StringBuilder(str).reverse().toString());
    }


    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
        System.out.println(reverseString("Java"));
        System.out.println(reverseString(""));
        System.out.println(reverseString("a"));
        System.out.println(reverseString("1234"));
        System.out.println(reverseString("Good morning"));


        System.out.println(isPalindrome("civic")); // true
        System.out.println(isPalindrome("madam")); // true
        System.out.println(isPalindrome("Madam")); // false
        System.out.println(isPalindrome("hello")); // false
    }
}
