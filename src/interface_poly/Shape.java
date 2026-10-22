package interface_poly;

public interface Shape {
    //method sig

    //CONTRACT to implementing classes

//    public abstract double calculateArea();
    double calculateArea(); //abstract by default; public

    default void displayInfo() {
        IO.print("Area: " + calculateArea());
    }
}

interface Resizable{
    void resize(double factor);
}

class Circle implements Shape, Resizable{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void resize(double factor){
        this.radius *= factor;
    }

    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void displayInfo(){
        IO.print("Area Circle: " + calculateArea());
    }
}

class Trapezoid implements Shape{
    private double baseA, baseB, height;

    public Trapezoid( double baseA, double baseB, double height){
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }


    @Override
    public double calculateArea(){
        return (baseA + baseB) / 2 * height;
    }

}

class AnotherTrapezoid extends Trapezoid implements  Resizable{
    @Override
    public void resize(double factor){

    }

    public AnotherTrapezoid(double a, double b, double h){
        super(a, b, h);
    }
}

class ShapeDemo{
    static void main() {
        Shape[] shapes = {new Circle(5), new Trapezoid(3, 5, 2)};
        for(Shape s : shapes){
//            IO.println(s.displayInfo());
            s.displayInfo();
        }
    }
}