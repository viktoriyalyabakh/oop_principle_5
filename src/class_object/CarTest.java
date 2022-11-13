package class_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("White", "BMW", "X6", 2020, 13000);
        Car car2 = new Car("Black", "Tesla", "S", 2023, 20000);
        Car car3 = new Car("Beige", "Toyota", "Camry", 2018, 10000);
        Car car4 = new Car("Blue", "Tesla", "X", 2021, 13000);
        Car car5 = new Car("Black", "Audi", "A7", 2022, 15000);

        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(car1, car2, car3, car4, car5));

        System.out.println("\n---------Print each car----------/n");
        cars.forEach(System.out::println);

        /*
        find the most expensive car
         */

        Car mostExpencive = cars.get(0);

        for(Car car: cars) {
            if(car.price > mostExpencive.price) mostExpencive = car;
        }
        System.out.println(mostExpencive);

        System.out.println("\n--------Count how many black---------\n");

        int howManyBlack = 0;

        for(Car car: cars){
            if(car.color.equals("Black")) howManyBlack ++;

        }
        System.out.println(howManyBlack);

        System.out.println("\n--------Count how many black with stream---------\n");

        System.out.println(cars.stream().filter(car -> car.color.equals("Black")).count());


        System.out.println("\n-------Count how many blue beige  or 2023-----------\n");
        /*
        Count all the cars that are Blue or Beige or 2023 -> 3
         */
        int counter = 0;

        for(Car car: cars){
            if(car.color.equals("Blue") || car.color.equals("Beige") || car.year == 2023)
                counter++;
        }
        System.out.println(counter);

        System.out.println("\n----------Remove all Tesla-------------\n");
        /*
        Remove all the cars that are Tesla and print the size of the cars
        Expected:
        3
         */
        Iterator<Car> iterator = cars.iterator();
        while(iterator.hasNext()){
            if(iterator.next().make.equals("Tesla")) iterator.remove();
        }


        cars.removeIf(c -> c.make.matches("Tesla"));
        System.out.println(cars.size());

    }
}
