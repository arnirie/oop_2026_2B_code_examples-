package polymorph;

public abstract class Shape {
    //template for subclasses
    //instance variables, concrete methods, abstract methods

    protected String color;

    public Shape(String color){
        this.color = color;
    }

    public abstract double calculateArea();

    public void displayInfo(){
        IO.println("Color: " + color);
        IO.println("Area: " + calculateArea());
    }
}
//create subclass Trapezoid, with its dimensions and compute the area
class Circle extends Shape{
    private double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI  * Math.pow(radius, 2);
    }

}

class Trapezoid extends Shape{
    private double baseA, baseB, height;

    public Trapezoid(String color, double baseA, double baseB, double height){
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }


    @Override
    public double calculateArea(){
        return (baseA + baseB) / 2 * height;
    }
}

class ShapeDemo{
    static void main() {
       // Shape p = new Shape("red");
        Circle c = new Circle("red", 4);
        Trapezoid t = new Trapezoid("blue", 2, 3, 5);
        Shape[] shapes = {c, t, new Circle("black", 3.3)};
        for(Shape s : shapes){
            s.displayInfo();
        }
        Circle circle = new Circle(" ", 0);
    }
}




