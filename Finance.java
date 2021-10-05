package com.company.syntax.reviewclass11;

public interface Finance {

    void takeCreditCard();

}
interface FederalBank extends Finance{
    void checkBalanceInFederalBank();
    void checkInterestAmountInFederalBank();

    static void depositMoney(){
        System.out.println("Money is deposited in fedreal bank");
    }

}
class AllyBank{
    public void emiPolicy(){
        System.out.println("Here you will get all emi policy ");
    }
}
class PNC extends AllyBank implements FederalBank{

    @Override
    public void takeCreditCard() {
        System.out.println("It checks ");
    }

    @Override
    public void checkBalanceInFederalBank() {

    }

    @Override
    public void checkInterestAmountInFederalBank() {

    }
}