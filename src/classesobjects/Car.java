package classesobjects;

public class Car {
    String maker;
    String model;
    short year;
    short speed;
    boolean isAutomatic;
    static int count = 0;

    //default
    Car(){
        maker = "";
        model = "";
        year = 2000;
        speed = 0;
        isAutomatic = false;
        count++;
    }

    //parameterized constructor
    Car(String maker, String model){
//        maker = maker;
        this.maker = maker;
        this.model = model;
        this.year = 0;
        this.speed = 0;
        this.isAutomatic = false;
        count++;
    }

    void displayInfo(){
        System.out.println(maker );
        System.out.println(speed);
    }

    static void displayCount(){
        System.out.println(count);
    }
}

class CarDemo{
    static void main() {
        Car car1 = new Car("toyota", "vios");
        Car car2 = new Car();
        car1.model = "vios";
        car2.model = "civic";
        Car.displayCount();

    }
}