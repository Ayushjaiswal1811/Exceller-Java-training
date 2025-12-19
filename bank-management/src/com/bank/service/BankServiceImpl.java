package com.bank.service;

import java.util.Scanner;

import com.bank.model.Account;
import com.bank.service.BankService;
import com.bank.constant.AccountType;
import com.bank.model.CurrentAccount;
import com.bank.model.SavingsAccount;
import com.bank.model.User;
import com.bank.service.BankService;

public class BankServiceImpl implements BankService {
  public void createAccount(){
    String name;
    String mobile_number; 
    String email;
    double balance;
    AccountType accounttype;
    Account account;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the user details : ");
    System.out.println("Name : ");
    name = sc.nextLine();
    System.out.println("E-mail : ");
    email = sc.nextLine();
    System.out.println("Mobile Number : ");
    mobile_number = sc.nextLine();
    User u1 = new User(name,email,mobile_number);
    System.out.println("Account Balance : ");
    balance = sc.nextDouble();
//    if (balance<=500){
//      System.out.println("balance should be greater than 500.");
//      balance = sc.nextByte();
//    }
    System.out.println("Select Account Type : ");
    System.out.println("1 for Savings.");
    System.out.println("2 for Current.");
    int accountoption =sc.nextInt();
    if(accountoption==1){
      account = new SavingsAccount(u1,balance);
      System.out.println(account.toString());
    }else
    {
      account = new CurrentAccount(u1,balance);
      System.out.println(account.toString());
    }
    
    
  }
}