package com.techelevator;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }
    public SavingsAccount (String accountHolderName, String accountNumber){
        super(accountHolderName, accountNumber);
    }
    //* if remaining balance is less than 150, add $2 Service withdrawl
    public int withdraw(int amountToWithdraw){
        int savingsLimit = this.getBalance()-amountToWithdraw;
        if(savingsLimit < 150 && savingsLimit > 0 && amountToWithdraw > 0 ) {
            return super.withdraw (amountToWithdraw + 2);
        }else if (savingsLimit > 150 && amountToWithdraw>0) {
            return super.withdraw(amountToWithdraw);
        }else{
                return this.getBalance();
            }
        }
}
