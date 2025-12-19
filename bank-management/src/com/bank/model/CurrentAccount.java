package com.bank.model;

import com.bank.constant.AccountType;

public class CurrentAccount extends Account {
  private static final double MAX_BALANCE = 1000.0; 
  public CurrentAccount( User user, double balance) {
      super(user, balance, AccountType.CURRENT_ACCOUNT);
  }
  
  public double getMaxBalance() {
    return MAX_BALANCE;
  }

  @Override
  public String toString() {
    return "CurrentAccount{" +
            "user=" + user +
            '}';
  }
}
