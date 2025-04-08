package com.xworkz.bankaccount.customer;

import com.xworkz.bankaccount.account.BankAccount;

public class Customer
{
    public String customerName;
    public  String address;
    public int noOFAccounts;
    public BankAccount[] bankAccounts;

    public void getCustomerDetails()
    {
        System.out.println("Name of the Customer : "+customerName);
        System.out.println("Address of the Customer : "+address);
        System.out.println("Number of Accounts : "+noOFAccounts);
        System.out.println("The accounts are : ");
        for(BankAccount bankAccount:bankAccounts)
            bankAccount.getAccountDetails();

    }


}
