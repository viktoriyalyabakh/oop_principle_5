package oop_principles.encapsulation;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeClub {
    public static void main(String[] args) {

        /*
        Create 2 companies as company1 and company2
        company1 -> Microsoft, Washington, (000) 123-1234
        company2 -> Apple, California, (000) 000-0000
         */

        Company company1 = new Company("Microsoft", "Washington", "(000) 123-1234");
        Company company2 = new Company("Apple", "California", "(000) 000-0000");

        Employee emp1 = new Employee("John Doe", "Manager", 45, company1);
        Employee emp2 = new Employee("Alex Smith", "Developer", 40, company2);
        Employee emp3 = new Employee("Jane Doe", "Developer", 20, company1);
        Employee emp4 = new Employee("Ryan Smith", "Tester", 22, company1);
        Employee emp5 = new Employee("James Reynold", "Tester", 30, company2);
        Employee emp6 = new Employee("Matt Morgan", "Developer", 40, company1);

        /*
        # employees for Apple -> 2
        # employees for Microsoft -> 4
        # managers -> 1
        # developers -> 3
        # testers -> 2
        # developers work in Microsoft -> 2

        Find the youngest developer -> Jane is the youngest with age = 20
        Find the oldest employee -> John is the oldest with the age = 45
         */

        Employee[] employees = {emp1, emp2, emp3, emp4, emp5, emp6};

        System.out.println("\n-------Count Apple and Microsoft employee number------\n");

        int totalAppleEmployee = 0;

        for (Employee employee : employees) {
            if(employee.getCompany().getName().equals("Apple")) totalAppleEmployee++;
        }

        System.out.println(totalAppleEmployee);

        //Total # employees work for Microsoft
        System.out.println(Arrays.stream(employees).filter(e -> e.getCompany().getName().equals("Microsoft")).count());


        System.out.println("\n-------Count Developer employee number------\n");
        int totalDevs = 0;

        for (Employee employee : employees) {
            if(employee.getJobPosition().equals("Developer")) totalDevs++;
        }

        System.out.println(totalDevs);

        System.out.println(Arrays.stream(employees).filter(e -> e.getJobPosition().equals("Tester")).count());


        System.out.println("\n-------Count Developer employee number for Microsoft------\n");

        int devForMicrosoft = 0;

        for (Employee employee : employees) {
            if(employee.getJobPosition().equals("Developer") && employee.getCompany().getName().equals("Microsoft")) devForMicrosoft++;
        }

        System.out.println(devForMicrosoft);

        System.out.println(Arrays.stream(employees).filter(x -> x.getCompany().getName().equals("Apple") && x.getJobPosition().equals("Tester")).count());

        System.out.println("\n-------Find the oldest Developer working for Microsoft------\n");
        //Matt is the oldest Developer working for Microsoft with the age = 40

        /*
        Employee oldestMicrosoftDev = new Employee();

        for (Employee employee : employees) {
            if(employee.getCompany().getName().equals("Microsoft")
            && employee.getJobPosition().equals("Developer")
            && employee.getAge() > oldestMicrosoftDev.getAge()) oldestMicrosoftDev = employee;
        }

        System.out.println(oldestMicrosoftDev);

         */

        Employee oldestMicrosoftDev = Arrays.stream(employees).
                filter(
                        e -> e.getCompany().getName().equals("Microsoft")
                                && e.getJobPosition().equals("Developer")).
                max(Comparator.comparingInt(Employee::getAge)).get();



        System.out.println(oldestMicrosoftDev.getFullName().split(" ")[0]
                + " is the oldest "
                + oldestMicrosoftDev.getJobPosition()
                + " working for "
                + oldestMicrosoftDev.getCompany().getName()
                + " with the age = "
                + oldestMicrosoftDev.getAge());

    }
}
