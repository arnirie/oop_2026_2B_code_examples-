package practice_abstract_interface;

import java.util.ArrayList;

/*
Task 1: Create the Core Interface (Payable)
Declare an interface named Payable.
Declare the following abstract methods (remember: interface cannot hold instance variables like amount, so data is passed or retrieved via methods):
String getTransactionId();
double getAmount();
boolean validatePayment();
double calculateProcessingFee();
Implement a default method inside the interface:
default void processTransaction():
Calls validatePayment().
If valid, calculates total = getAmount() + calculateProcessingFee() and prints a formatted receipt showing Transaction ID, Base Amount, Fee, and Total Charged.
If invalid, prints "Transaction [getTransactionId()] FAILED: Invalid payment details."
Task 2: Create the Secondary Interface (Rewardable)
Declare an interface named Rewardable.
Declare one abstract method:
double calculateRewardPoints(); – returns the reward points earned from the transaction.
 */
public interface Payable {
    String getTransactionId();
    double getAmount();
    boolean validatePayment();
    double calculateProcessingFee();

    default void processTransaction(){
        if(validatePayment()){
            double totalAmt = getAmount() + calculateProcessingFee();
            IO.println("Transaction ID: " + getTransactionId());
            IO.println("Amount: " + getAmount());
            IO.println("Processing Fee: " + calculateProcessingFee());
            IO.println("Total Amount: " + totalAmt);
        } else {
            IO.println("Transaction " + getTransactionId() + " FAILED: Invalid Payment Details");
        }
    }

}

interface Rewardable{
    double calculateRewardPoints();
}


class ICreditCardPayment implements  Payable, Rewardable{
    private String transactionId, cardNumber, cvv;
    private double amount;

    public ICreditCardPayment(String transactionId, double amount, String cardNumber, String cvv) {
        this.transactionId = transactionId;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String getTransactionId() {
        return transactionId;
    }

    @Override
    public boolean validatePayment(){
        return cardNumber.length() == 16 && cvv.length() == 3;
    }

    @Override
    public double calculateProcessingFee(){
        return amount * 0.025;
    }

    @Override
    public double calculateRewardPoints(){
        return Math.floor(amount/100);
    }
}

/*
DigitalWalletPayment
Additional Attributes: walletId (String, e.g., mobile number or email) and walletBalance (double).
Constructor: Accepts transactionId, amount, walletId, and walletBalance.
calculateProcessingFee(): Digital wallets charge a flat fee of $15.00 (or ₱15.00) for transactions over 1000.00, and 0.00 for 1000.00 or below.
validatePayment(): Returns true only if walletBalance is greater than or equal to amount + calculateProcessingFee()
 */
class IDigitalWalletPayment implements Payable{
    private String transactionId, walletId;
    private double amount, walletBalance;

    public IDigitalWalletPayment(String transactionId, double amount, String walletId, double walletBalance) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.walletId = walletId;
        this.walletBalance = walletBalance;
    }

    @Override
    public String getTransactionId() {
        return transactionId;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean  validatePayment(){
        return walletBalance >= amount + calculateProcessingFee();
    }

    @Override
    public double calculateProcessingFee(){
        return amount > 1000 ? 15 : 0;
    }
}

class TestInterface {
    static void main() {
        ArrayList<Payable> payments = new ArrayList<>();
        payments.add(new ICreditCardPayment("#001", 500,
                "1234567890123456", "1234"));
        payments.add(new IDigitalWalletPayment("#002", 100,
                "456", 500));
        payments.add(new IDigitalWalletPayment("#003", 1000,
                "890", 500));
        for(Payable payment : payments){
            payment.processTransaction();
            if(payment.validatePayment() && payment instanceof  Rewardable reward){
                //cast payment -> Rewardable
                IO.println("Rewards Points: " + reward.calculateRewardPoints());
            }
        }
    }
}






