package com.xworkz.bankaccount.account;

public class BankAccount
{
    public int accountId;
    public String type;
    public String bankName;
    public String  branches[];
    public void getAccountDetails()
    {
        System.out.println("Account Id : "+accountId);
        System.out.println("Account Type : "+type);
        System.out.println("Bank Name : "+bankName);
        System.out.println("Branches : ");
        for(String branch:branches)
            System.out.print(branch+" ");



    }

}
