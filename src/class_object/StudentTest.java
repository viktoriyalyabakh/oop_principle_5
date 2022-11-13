package class_object;

import java.sql.Struct;

public class StudentTest {
    public static void main(String[] args) {

        System.out.println(Student.numberOfStudent);//0
        System.out.println(Student.program);//SDET

        Student student1 = new Student("John", "Doe", 33);
        System.out.println(Student.numberOfStudent);//1

        Student student2 = new Student("Jane", "Doeli", 34);
        System.out.println(Student.numberOfStudent);//2

        student1.study();
        student2.study();

        student1.rest();
        student2.rest();


    }
}
