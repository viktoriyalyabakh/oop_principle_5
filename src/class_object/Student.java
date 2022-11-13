package class_object;

public class Student {

    public Student(){}

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        sddStudent();
    }

    public static int numberOfStudent = 0;

    public static final String program = "SDET";

    public String firstName;
    public String lastName;
    public int age;
    public Teacher teacher;

    public void study(){
        System.out.println(this.firstName + " study");
    }
    public void rest(){
        System.out.println(this.firstName + " " + this.lastName + " has rest");
    }
    public static void sddStudent(){
        numberOfStudent++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
