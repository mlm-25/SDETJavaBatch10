package com.company.syntax.class24.hw;

public class CreditCard {

    double balance;
    double interest;

    public CreditCard(double balance) {
        this.balance = balance;

    }
    /*
        Create a class CreditCard and define variable balance and interest.
        Create an instance method that will calculate interest based on the given balance.
        Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
        Call the method by creating an object of each of the three classes.
         */
    void calculateInterest(){
        interest=balance*0.15;
        System.out.println("Yearly interest is "+interest);
    }
}
class Visa extends CreditCard {
    public Visa(double balance) {
        super(balance);
    }
}
class AX extends CreditCard {
    public AX(double balance) {
        super(balance);
    }
    @Override
    void calculateInterest() {
        interest = balance * 0.10;
        System.out.println("Yearly interest is " + interest);
    }
}