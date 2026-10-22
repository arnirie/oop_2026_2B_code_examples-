package midterm;

public class Pet {
    private String name;
    private int age;
    private double adoptionFee;
    private int daysInShelter;
    private static int petCount;

    public Pet(String name, int age, double adoptionFee, int daysInShelter) {
        this.name = name;
        this.age = age;
        this.adoptionFee = adoptionFee;
        this.daysInShelter = daysInShelter;
        petCount++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAdoptionFee() {
        return adoptionFee;
    }

    public int getDaysInShelter() {
        return daysInShelter;
    }

    public static int getPetCount() {
        return petCount;
    }

    public String getCareLevel(){
        return "Standard Care";
    }

    public boolean isOlderThen(Pet other){
        if(other == null) return false;
//        if(this.age > other.age)
//            return true;
//        else
//            return false;
        return this.age > other.age;
    }

}

class Dog extends Pet{
    private String breed;
    private boolean isHouseTrained;

    public Dog(String name, int age, double adoptionFee, int daysInShelter, String breed, boolean isHouseTrained){
        super(name, age, adoptionFee, daysInShelter);
        this.breed = breed;
        this.isHouseTrained = isHouseTrained;
    }

    public double calculateDiscountedFee(){
        double aFee = getAdoptionFee();
        if(isHouseTrained) aFee -= aFee * 0.1;
        if(getDaysInShelter() > 30) aFee -= aFee * .15;
        return aFee;
    }

    @Override
    public String getCareLevel(){
        if(super.getAge() > 7) return "Senior Care";
        else if(!isHouseTrained) return "Training Required";
        else return "Standard Care";
    }
}

class Cat extends Pet{
    private String color;
    private boolean isIndoorOnly;

    public Cat(String name, int age, double adoptionFee, int daysInShelter, String color, boolean isIndoorOnly){
        super(name, age, adoptionFee, daysInShelter);
        this.color = color;
        this.isIndoorOnly = isIndoorOnly;
    }

    public double calculateDiscountedFee(){
        double aFee = getAdoptionFee();
        if(isIndoorOnly) aFee -= aFee * 0.2;
        if(getDaysInShelter() > 45) aFee -= aFee * .1;
        return aFee;
    }

    @Override
    public String getCareLevel(){
        if(super.getAge() >= 7) return "Senior Care";
        else return "Standard Care";
    }
}




