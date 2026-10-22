package inheritance;

public class Teacher {
    private String name;
    String department;

    public Teacher(String name, String department){
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void display(){
        System.out.println(name);
        System.out.println(department);
    }
}

class PartTimeTeacher extends Teacher{
    private int monthsContract;

    public PartTimeTeacher(String name, String department){
        super(name, department); //constructor for superclass
    }

    public PartTimeTeacher(String name, String department, int monthsContract){
        super(name, department); //constructor for superclass
        this.monthsContract = monthsContract;
    }

    public int getMonthsContract() {
        return monthsContract;
    }

    public void setMonthsContract(int monthsContract) {
        this.monthsContract = monthsContract;
    }

    @Override
    public void display(){
        IO.println("overrriden");
    }

}


