package com.bank.model;

import com.bank.constant.AccountType;
import com.bank.util.IDGenerator;


public class Account {
  protected String accountNumber;
  protected User user;
  protected double balance;
  protected AccountType accountType;
  IDGenerator id = new IDGenerator();
  public Account( User user, double balance, AccountType accountType) {
      this.user = user;
      this.balance = balance;
      this.accountType = accountType;
      this.accountNumber=id.generateAccountNumber(accountType);
  }

  public String getAccountNumber() {
      return accountNumber;
  }

  public User getUser() {
      return user;
  }

  public AccountType getAccountType() {
      return accountType;
  }

  public double getBalance() {
      return balance;
  }

  public void deposit(double amount) {
      if (amount > 0) {
          balance += amount;
      }
  }
  public String  withdraw(double amount) {
      if (amount > 0 && amount <= balance) {
          balance -= amount;
          return "Withdrawal successful";
      }
      else {
          return "Withdrawal failed";
      }
  }

    @Override
    public String toString() {
        return "Account{" +
                "user=" + user +
                '}';
    }
}
