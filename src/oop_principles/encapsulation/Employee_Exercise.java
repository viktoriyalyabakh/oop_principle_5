package oop_principles.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee_Exercise {
    public static void main(String[] args) {

        /*
        Create 3 companies
        name, address, phone
        Tesla, California, 123
        USBank, Minnesota, 000
        Verizon, Texas, 111

        Create 10 employees
        fullname, jobPosition, age, company
        Andrii, Developer, 25, Tesla
        Yildiz, System Architect, 23, USBank
        Malek, Developer, 30, Verizon
        Saeed, Manager, 35, Verizon
        Samir, Tester, 20, USBank
        Viktoriya, Designer, 30, Tesla
        Ibrahim, Designer, 27, Tesla
        Jeremiah, Scrum Master, 21, USBank
        Olena, Tester, 29, Verizon
        Yoanna, Tester, 23, Tesla
         */

        Company c1 = new Company("Tesla", "California", "123");
        Company c2 = new Company("USBank", "Minnesota", "000");
        Company c3 = new Company("Verizon", "Texas", "111");

        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Andrii","Developer", 25, c1),
                new Employee("Yildiz","System Architect", 23, c2),
                new Employee("Malek","Developer", 30, c3),
                new Employee("Saeed","Manager",35 ,c3),
                new Employee("Samir", "Tester",20, c2),
                new Employee("Viktoriya", "Designer",30 ,c1),
                new Employee("Ibrahim", "Designer",27 ,c1),
                new Employee("Jeremiah", "Scrum Master", 21 , c2),
                new Employee("Olena","Tester", 29, c3),
                new Employee("Yoanna","Tester", 23, c1)
        ));

        /*
        Write a program to find and report below information

        Employee numbers for each company
        Tesla = 4
        USBank = 3
        Verizon = 3


        Employee numbers for each position
        Tester = 3
        Developer = 2
        Manager = 1
        Designer = 2
        System Architect = 1
        Scrum Master = 1

        Find youngest
        Youngest tester = Samir with the age of 20
        Youngest developer = Andrii with the age of 25
        Youngest designer = Ibrahim with the age of 27

        Find the company
        Manager = Saeed works at Verizon
        System Architect = Yildiz works at USBank
        Scrum Master = Jeremiah works at USBank
         */

        int teslaEmployees = 0, usbankEmployees = 0, verizonEmployees = 0;

        int tester = 0, developer = 0, manager = 0, designer = 0, systemArchitect = 0, scrumMaster = 0;

        Employee youngestTester = new Employee();
        youngestTester.setAge(Integer.MAX_VALUE);
        Employee youngestDeveloper = new Employee();
        youngestDeveloper.setAge(Integer.MAX_VALUE);
        Employee youngestDesigner = new Employee();
        youngestDesigner.setAge(Integer.MAX_VALUE);

        Employee managerEmployee = new Employee();
        Employee systemArchitectEmployee = new Employee();
        Employee scrumMasterEmployee = new Employee();

        for (Employee employee : employees) {
            if(employee.getCompany().getName().equals("Tesla")) teslaEmployees++;
            else if(employee.getCompany().getName().equals("USBank")) usbankEmployees++;
            else verizonEmployees++;

            switch (employee.getJobPosition()) {
                case "Tester":
                    tester++;
                    if(employee.getAge() < youngestTester.getAge()) youngestTester = employee;
                    break;
                case "Developer":
                    developer++;
                    if(employee.getAge() < youngestDeveloper.getAge()) youngestDeveloper = employee;
                    break;
                case "Manager":
                    manager++;
                    managerEmployee = employee;
                    break;
                case "Designer":
                    designer++;
                    if(employee.getAge() < youngestDesigner.getAge()) youngestDesigner = employee;
                    break;
                case "System Architect":
                    systemArchitect++;
                    systemArchitectEmployee = employee;
                    break;
                case "Scrum Master":
                    scrumMaster++;
                    scrumMasterEmployee = employee;
                    break;
                default:
                    System.out.println("No match");
            }

        }

        System.out.println("Employee numbers for each company");
        System.out.println("Tesla = " + teslaEmployees + "\nUSBank = " + usbankEmployees + "\nVerizon = " + verizonEmployees);

        System.out.println("\nEmployee numbers for each position");
        System.out.println("Tester = " + tester + "\nDeveloper = " + developer +
                            "\nManager = " + manager + "\nDesigner = " + designer +
                            "\nSystem Architect = " + systemArchitect + "\nScrum Master = " + scrumMaster);

        System.out.println("\nFind youngest");
        System.out.println("Youngest tester = " + youngestTester.getFullName() + " with the age of " + youngestTester.getAge());
        System.out.println("Youngest tester = " + youngestDeveloper.getFullName() + " with the age of " + youngestDeveloper.getAge());
        System.out.println("Youngest tester = " + youngestDesigner.getFullName() + " with the age of " + youngestDesigner.getAge());

        System.out.println("\nFind the company");
        System.out.println(managerEmployee.getJobPosition() + " = " + managerEmployee.getFullName() + " works at " + managerEmployee.getCompany().getName());
        System.out.println(systemArchitectEmployee.getJobPosition() + " = " + systemArchitectEmployee.getFullName() + " works at " + systemArchitectEmployee.getCompany().getName());
        System.out.println(scrumMasterEmployee.getJobPosition() + " = " + scrumMasterEmployee.getFullName() + " works at " + scrumMasterEmployee.getCompany().getName());


    }
}