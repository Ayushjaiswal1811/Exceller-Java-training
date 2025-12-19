package com.bank.util;
import com.bank.constant.AccountType;
import java.time.LocalDateTime;
import java.util.*;

public class IDGenerator {
  private static int counter = 0;
  public String generateAccountNumber(AccountType accountType) {
      String prefix = "";
      switch (accountType) {
          case SAVINGS_ACCOUNT:
              prefix = "SAV";
              break;
          case CURRENT_ACCOUNT:
              prefix = "CUR";
              break;
      }
      long uniqueNumber = LocalDateTime.now().getYear()+ counter++; 
      return prefix + String.format("%06d", uniqueNumber);
  }

  public String generateUserID() {
      return UUID.randomUUID().toString();
  }
}
