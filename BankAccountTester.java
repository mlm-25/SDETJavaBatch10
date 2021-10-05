package com.company.syntax.class27.encapsulationdemo1;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setName("asdfghjk23457456");
        bankAccount.setPassword("123456");
        System.out.println(bankAccount.getBalance("asdfggh"));
    }
}
