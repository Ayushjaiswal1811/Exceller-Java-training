package com.bank.model;

import com.bank.constant.AccountType;

public class SavingsAccount extends Account {
  private static final double MIN_BALANCE = 500.0; 
  public SavingsAccount( User user, double balance) {
      super(user, balance, AccountType.SAVINGS_ACCOUNT);
  }
  
  public double getMinBalance() {
    return MIN_BALANCE;
  }

  @Override
  public String toString() {
    return "SavingsAccount{" +
            "user=" + user +
            '}';
  }
}
