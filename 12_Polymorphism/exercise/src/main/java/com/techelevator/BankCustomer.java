package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    //public static void BankCustomer(String[] args) {
    //List<Accountable> accounts = new ArrayList<>();

    //* getters & setters boi
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address=address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber=phoneNumber;
    }
    //* methods

    public void addAccount(Accountable newAccount) {
          this.accounts.add(newAccount);                         //*adds newAccount to list of accnts
    }

    public Accountable[] getAccounts() {
        return accounts.toArray(new Accountable[accounts.size()]);

    }
    public boolean isVip(){
        int netWorth = 0;
        for (int i = 0; i< accounts.size(); i++){
            netWorth += this.accounts.get(i).getBalance();
        } int VipStatus = 25000;
        return netWorth >= VipStatus;
    }
}
//