package inheritance;

public class TeacherDemo {
    static void main() {
        Teacher t = new Teacher("arni", "it");
        PartTimeTeacher pt = new PartTimeTeacher("rie", "math");
        t.display();
        pt.display();

    }
}
