package uml;

import java.util.Locale;
import java.util.Scanner;

public class StudentManager {
    static Student[] studentList;
    static byte studentMax = 2;

    static void main() {
        studentList = new Student[studentMax];
        Scanner sc = new Scanner(System.in);
        char choice = 0;
        boolean toLoop = true;
        while(toLoop){
            displayMenu();
            System.out.print("Choose an option: ");
            choice = sc.nextLine().toLowerCase().charAt(0);
            switch (choice){
                case 'd':
                    System.out.println("Thank you and goodbye!");
                    toLoop = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void displayMenu(){
        System.out.println("=== STUDENT MANAGEMENT SYSTEM");
        System.out.println("A. Add Student");
        System.out.println("B. Remove Student by ID");
        System.out.println("C. Display All Students");
        System.out.println("D. Exit");
    }
}
