package advanced;

public class Teacher {
    private String name; //default / package-private
    private String department;
    private static int count;

    //init block
    //instance
    {
        name = "";
        department = "";
        IO.println("instance init block called");
    }

    //static

    static {
        count = 0;
        IO.println("static init block");
    }

    public Teacher(String name){
        this.name = name;
        IO.println("constructor called");
    }

    public String getName(){
        return this.name;
    }
}

