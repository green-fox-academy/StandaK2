package teachersandstudents;

public class Teacher {

    public Teacher() {
    }

    public String answer() {
        return ("This is my answer on your question.");
    }

    public String teach(Student student) {
        return student.learn();
    }
}
