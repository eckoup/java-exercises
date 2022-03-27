package com.techelevator;

  public class CreditCardAccount implements Accountable{
    private int debt=0;
    private String accountNumber;
    private String accountHolder;


    //*getters & setters
      public int getBalance(){ //implement getbalance method
          return (debt * -1);
      }
    public String getAccountHolder(){
        return accountHolder;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public int getDebt(){
        return this.debt;
    }
    //* constructor -- a new card requires account holder & account number. default 0 balance
    public CreditCardAccount (String accountHolder, String accountNumber){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;

    }
    //method names
    public int pay(int amountToPay){
        debt= debt - amountToPay;
        return debt;
    }

    public int charge(int amountToCharge){
        debt=debt+amountToCharge;
        return debt;
        }
}
