//        Create Student and Teacher classes
//        Student
//        learn()
//        question(teacher) -> calls the teachers answer method
//        Teacher
//        teach(student) -> calls the students learn method
//        answer()


package teachersandstudents;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        Teacher teacher = new Teacher();

        System.out.println(student.question(teacher));
        System.out.println(teacher.teach(student));
    }
}
