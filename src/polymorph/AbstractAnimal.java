package polymorph;

public abstract class AbstractAnimal { //base class template

    //concrete -> with body
    public void sleep(){
        IO.println("zzzzzzzzz");
    }

    public abstract void makeSound();
}

class Aso extends AbstractAnimal{

    public void makeSound(){
        IO.println("arf arf");
    }

    public void jump(){

    }
}

class Pusa extends AbstractAnimal{
    public void makeSound(){

    }
}

class AbstractAnimalDemo{
    static void main() {
        Aso a = new Aso();
        Pusa p = new Pusa();
        a.makeSound();
        p.sleep();
    }
}
