package classesobjects;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
    private String name;
    private String specialization;
    private int yearsOfService;

    public Teacher(){
        name = "";
        specialization = "";
        yearsOfService = 0;
    }

    public Teacher(String name, String specialization, int yearsOfService) {
        this.name = name;
        this.specialization = specialization;
        this.yearsOfService = yearsOfService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public void displayOnOneLine(){
        System.out.printf("%s\t%s\t%d\n", this.name, this.specialization, this.yearsOfService);
    }
}

class TeacherDemo{
    static void main() {
//        Object obj = new Teacher("arni", "it", 5);
//
//        Teacher guro = new Teacher();
//        System.out.println(guro.getClass().getName());
//        if(obj instanceof Student){
//            Student teach = (Student)obj;
//        }
//        System.out.println();

        //arraylist
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        while(true){
            System.out.print("Do you want to add a new teacher record <y/n>? ");
            if(sc.nextLine().equalsIgnoreCase("n")) break;
            Teacher t = new Teacher();
            System.out.print("Enter name: ");
            t.setName(sc.nextLine());
            System.out.print("Enter specialization: ");
            t.setSpecialization(sc.nextLine());
            System.out.print("Enter years of service: ");
            t.setYearsOfService(sc.nextInt());
            sc.nextLine();
            teachers.add(t);
            //if yes, add; if no, stop
        }
        //display all entered
        System.out.println("All Entered Teacher Records");
        for(Teacher t : teachers){
            t.displayOnOneLine();
        }
        //search
        System.out.print("Enter name to delete: ");
        String search = sc.nextLine();
        boolean isFound = false;
//        for(Teacher t : teachers){
//            if(t.getName().toLowerCase().contains(search.toLowerCase())){
//                t.displayOnOneLine();
//                isFound = true;
//            }
//        }
//        if(!isFound) System.out.println(search + " is not found");
            //search the object with the entered name
        Object toRemove = null;
//        Teacher toRemove = null;
        for(Teacher t : teachers){
            if(t.getName().equalsIgnoreCase(search.toLowerCase())){
//                teachers.remove(t);
                toRemove = t;
                isFound = true;
                break;
            }
        }
        if(isFound) teachers.remove((Teacher)toRemove);
        for(Teacher t : teachers) t.displayOnOneLine();
    }
}
