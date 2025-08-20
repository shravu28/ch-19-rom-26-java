package com.xworkz.bank.bankaccount;

public class BankRunner {

    public static void main(String[] args) {

        BankAccount shravuAccount = new BankAccount();
        shravuAccount.credit(20000.00);

        shravuAccount.getBalance();

        BankAccount friendAccount = new BankAccount();
        shravuAccount.transfer(friendAccount,1000.00);


        System.out.println("The available balance in devsAccount:"+shravuAccount.getBalance());
        System.out.println("The available balance in friendAccount:"+friendAccount.getBalance());


        BankAccount  brotherAccount = new BankAccount();
        brotherAccount.transfer(shravuAccount,50000.00);

        System.out.println("The"+brotherAccount.getBalance());
    }
}
