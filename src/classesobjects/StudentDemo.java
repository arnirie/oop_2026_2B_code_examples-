package classesobjects;

public class StudentDemo {
    static void main() {
        //create object
        Student s1 = new Student();
        Student s2 = new Student();
        //access members
        //obj<dot><member>
        s1.name = "rey";
        s1.recite();
        s2.name = "jen";
        s2.recite();
    }
}
