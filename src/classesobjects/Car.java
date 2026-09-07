package classesobjects;

public class Car {
    private String maker;
    private String model;
    private short year;
    private short speed;
    private boolean isAutomatic;
    static int count = 0;

    public void setSpeed(short speed){
        if(speed < 0){
            System.out.println("Invalid speed");
            return;
        }
        this.speed = speed;
    }

    public short getSpeed(){
        return this.speed;
    }

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
        System.out.println(model );
//        System.out.println(speed);
    }

    static void displayCount(){
        System.out.println(count);
    }
}

class CarDemo{
    static void main() {
        Car car1 = new Car("toyota", "vios");
        Car car2 = new Car();
        car1.setSpeed((short)100);
        car2.setSpeed((short)-50);
        System.out.println(car1.getSpeed());
        car1.displayInfo();
        car2.displayInfo();

    }
}