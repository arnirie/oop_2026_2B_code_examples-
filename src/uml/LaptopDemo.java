package uml;

public class LaptopDemo {
    static void main() {
        Laptop lap = new Laptop("hp victus");
        Laptop.Processor cpu = lap.new Processor("intel", 5.5);
        cpu.diplayInfo();
//        Laptop.Processor cpu = new Laptop.Processor("intel", 5.5);
    }
}
