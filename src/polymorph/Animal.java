package polymorph;

public class Animal {
    private String breed;

    public Animal(){
        this.breed = "";
    }

    public Animal(String breed){
        this.breed  = breed;
    }

    public void makeSound(){
        IO.print("hello");
    }
}

class Dog extends Animal{
    public Dog(String breed){
        super(breed);
    }

    @Override
    public void makeSound(){
        IO.println("arf arf");
    }

    public void jump(){
        IO.println("jump");
    }
}

class Cat extends Animal{
    public Cat(String breed){
        super(breed);
    }

    @Override
    public void makeSound(){
        IO.println("meow meow");
    }
}

class AnimalDemo{
    static void main() {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Dog d1 = new Dog("aspin");
        Dog d2 = new Dog("pome");
//        a1.makeSound();
//        a2.makeSound();
//        d1.makeSound();
//        d2.makeSound();
        Animal[] animals = {new Animal(), new Animal(),
                new Dog("aspin"), new Dog("pome"),
                new Cat("persian")};
        for(Animal a : animals){
            a.makeSound();
        }
    }
}