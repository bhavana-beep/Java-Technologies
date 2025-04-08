package com.xworkz.bankaccount;
import com.xworkz.bankaccount.customer.Customer;
import com.xworkz.bankaccount.account.BankAccount;
public class BankAccountRunner
{
    public static void main(String args[])
    {
        Customer customer1=new Customer();
        customer1.customerName="Ram";
        customer1.address="Banglore";
        customer1.noOFAccounts=1;

        BankAccount account1=new BankAccount();
        account1.accountId=1;
        account1.type="Savings";
        account1.bankName="Bank Of Baroda";

        String branches[]={"Rajaji Nagar","Jp Nagar"};
        account1.branches=branches;

        BankAccount bankAccounts[]={account1};
        customer1.bankAccounts=bankAccounts;
        customer1.getCustomerDetails();

    }

}
