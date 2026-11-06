package practice_abstract_interface;

import java.util.ArrayList;

/*

Declare an abstract class named PaymentMethod.
Add the following protected or private attributes:
transactionId (String)
amount (double) – the base purchase amount before fees.
Create a parameterized constructor that initializes both attributes.
Declare abstract methods:
public abstract boolean validatePayment(); – returns true if payment details are valid, false otherwise.
public abstract double calculateProcessingFee(); – returns the extra fee based on the payment type.
Implement a concrete method:
public void processTransaction():
Calls validatePayment().
If valid, calculates the total amount (amount + calculateProcessingFee()) and prints a formatted receipt showing the Transaction ID, Base Amount, Fee, and Total Charged.
If invalid, prints "Transaction [transactionId] FAILED: Invalid payment details."
 */
public abstract class PaymentMethod {
    protected String transactionId;
    protected double amount;

    public PaymentMethod(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public abstract boolean validatePayment();

    public abstract double calculateProcessingFee();

    public void processTransaction(){
        if(validatePayment()){
            double totalAmt = amount + calculateProcessingFee();
            IO.println("Transaction ID: " + transactionId);
            IO.println("Amount: " + amount);
            IO.println("Processing Fee: " + calculateProcessingFee());
            IO.println("Total Amount: " + totalAmt);
        } else {
            IO.println("Transaction " + transactionId + " FAILED: Invalid Payment Details");
        }
    }
}


/*
CreditCardPayment
Additional Attributes: cardNumber (String) and cvv (String).
Constructor: Accepts transactionId, amount, cardNumber, and cvv.
validatePayment(): Returns true only if cardNumber has a length of 16 characters AND cvv has a length of 3 characters.
calculateProcessingFee(): Credit cards charge a 2.5% fee (amount * 0.025).
 */

class CreditCardPayment extends PaymentMethod{
    private String cardNumber, cvv;

    public CreditCardPayment(String transactionId, double amount, String cardNumber, String cvv) {
        super(transactionId, amount);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public boolean validatePayment(){
        return cardNumber.length() == 16 && cvv.length() == 3;
    }

    @Override
    public double calculateProcessingFee(){
        return amount * 0.025;
    }
}

/*
DigitalWalletPayment
Additional Attributes: walletId (String, e.g., mobile number or email) and walletBalance (double).
Constructor: Accepts transactionId, amount, walletId, and walletBalance.
calculateProcessingFee(): Digital wallets charge a flat fee of $15.00 (or ₱15.00) for transactions over 1000.00, and 0.00 for 1000.00 or below.
validatePayment(): Returns true only if walletBalance is greater than or equal to amount + calculateProcessingFee()
 */
class DigitalWalletPayment extends PaymentMethod{
    private String walletId;
    private double walletBalance;

    public DigitalWalletPayment(String transactionId, double amount, String walletId, double walletBalance) {
        super(transactionId, amount);
        this.walletId = walletId;
        this.walletBalance = walletBalance;
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

class Test {
    static void main() {
        ArrayList<PaymentMethod> payments = new ArrayList<>();
        payments.add(new CreditCardPayment("#001", 500,
                "1234567890123456", "123"));
        payments.add(new DigitalWalletPayment("#002", 100,
                "456", 500));
        payments.add(new DigitalWalletPayment("#003", 1000,
                "890", 500));
        for(PaymentMethod payment : payments){
            payment.processTransaction();
        }
    }
}

























