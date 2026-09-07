package classesobjects;

import java.util.Scanner;

public class Bicycle {
    private String owner;
    private double price;
    private int speed;
    private boolean isMountainBike;
    private char initials;

    public Bicycle(String owner, double price, int speed, boolean isMountainBike, char initials) {
        this.owner = owner;
        this.price = price;
        this.speed = speed;
        this.isMountainBike = isMountainBike;
        this.initials = initials;
    }

    public Bicycle() {
        this.owner = "";
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isMountainBike() {
        return isMountainBike;
    }

    public void setMountainBike(boolean mountainBike) {
        isMountainBike = mountainBike;
    }

    public char getInitials() {
        return initials;
    }

    public void setInitials(char initials) {
        this.initials = initials;
    }

    public void displayInfo(){
        System.out.println(owner);
        System.out.println(price );
        System.out.println(speed);
        System.out.println(isMountainBike);
        System.out.println(initials);
    }
}

class BicycleDemo{
    static void main() {
        Bicycle bike1 = new Bicycle();
        //bike2
        //array
        //type[] var = new type[]
        Bicycle[] bikes = new Bicycle[5];
        for(byte i = 0 ; i < bikes.length ; i++){
            bikes[i] = new Bicycle();
        }
        Scanner sc = new Scanner(System.in);
        //create loop to ask the user to enter 5 names and assign them as
        //owners to the individual bike
        for(byte i = 0 ; i < bikes.length ; i++){
            System.out.println("Bike #" + (i + 1));
            bikes[i].setOwner(sc.nextLine());
        }

    }
}
