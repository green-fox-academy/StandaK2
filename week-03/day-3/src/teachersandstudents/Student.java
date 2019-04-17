package teachersandstudents;

public class Student {

    public Student() {
    }

    public String learn() {
        return ("I'm learning now.");
    }

    public String question(Teacher teacher) {
        return teacher.answer();
    }
}
