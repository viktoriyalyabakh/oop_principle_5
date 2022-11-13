package class_object;

public class StudentTeacherPractice2 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Alex", "Smith");

        Student student1 = new Student("John", "Doe", 15);
        Student student2 = new Student("Jane", "Doe", 20);
        Student student3 = new Student("Mike", "Smith", 25);
        Student student4 = new Student("Robert", "Smith", 50);

        teacher.addStudent(student1);
        teacher.addStudent(student2);
        teacher.addStudent(student3);
        teacher.addStudent(student4);

        int oldest = Integer.MIN_VALUE;
        int youngest = Integer.MAX_VALUE;

        for(Student student: teacher.getStudents()){
            if(student.age > oldest) oldest = student.age;
            if(student.age < youngest) youngest = student.age;
        }
        System.out.println(Math.abs(youngest - oldest));

    }
}
