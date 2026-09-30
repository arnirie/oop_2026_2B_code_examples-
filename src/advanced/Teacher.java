package advanced;

class Laptop{
    private String model;
    private double price;
    private static int numItems;

    static {
        numItems = 0;
    }

    {
        price = 0;
    }

    public Laptop(String model){
        this.model = model;
//        this.price = 0;
        numItems++;
    }

    public double getPrice(){
        return this.price;
    }
}

public class Teacher {
    String name; //package-private (default)
    protected int age;
    private static int count;

    { //init instance
        System.out.println("init block called");
//        name = "";
        age = 0;
    }

    static {
        System.out.println("static init called");
        count = 0;
    }

    public Teacher(String name){
        this.name = name;
        System.out.println("constructor called");
    }

    public Teacher setName(String name){
        this.name = name;
        return this;//instance
    }

    public Teacher setAge(int age){
        this.age = age;
        return this;
    }

    public void display(){
        System.out.println(name);
        System.out.println(age);
    }

    public void trainTeacher(){
        Trainee.displayTrainee(this);
    }
}



class Trainee {
    public static void displayTrainee(Teacher t){
        t.display();
    }
}

