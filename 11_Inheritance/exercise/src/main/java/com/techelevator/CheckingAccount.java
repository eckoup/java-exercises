package com.techelevator;

public class CheckingAccount extends BankAccount {


    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public CheckingAccount(String accountHolderName, String accountNumber){
        super(accountHolderName, accountNumber);
    }

    public int withdraw(int amountToWithdraw) {
        int limit = this.getBalance() - amountToWithdraw;
        //if the transaction would make the balance go below -100
        if(limit <= -100){
            return this.getBalance();
        }

        //If the transaction would make the balance below 0 but above -100
        else if(limit > -100 && limit < 0){
            return super.withdraw(amountToWithdraw+10);
        }
        //If the transaction would make the balance above 0
        else{
            return super.withdraw(amountToWithdraw);
        }
    }
}
