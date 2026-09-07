public class Stud {
    private String name;
    private int age;
    private String studentId;
    private double gpa;
    private static int studentCount = 0;

    public Stud(String name, int age, String studentId, double gpa) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if(gpa >= 65 && gpa <= 100)         this.gpa = gpa;
        else System.out.println("Invalid grade");
    }

    public void study(){
        System.out.println(this.name + " is studying");
    }

    public static int getTotalStudents(){
        return studentCount;
    }

}
