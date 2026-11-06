package practice_abstract_interface;

public interface Comparable {
    int compareTo(Object other);
}

abstract class TwoPartMeasure implements  Comparable {
    public void changeBy(TwoPartMeasure other){

    }

    @Override
    public int compareTo(Object other){
        return 0;
    }

    public abstract void initializeUnits();

    @Override
    public String toString(){
        return "";
    }

}

class HolidayAccount implements Comparable {
    public void deposit(double amount){

    }

    public double getBalance(){
        return 0;
    }

    public String getAccountId(){
        return "";
    }

    public void setBalance(double balance){}

    @Override
    public int compareTo(Object other){
        return 0;
    }
}

class Length extends TwoPartMeasure {

    @Override
    public void initializeUnits() {

    }
}

class Weight extends TwoPartMeasure {

    @Override
    public void initializeUnits() {

    }
}
