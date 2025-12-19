package app;
import com.bank.constant.AccountType;
import com.bank.model.CurrentAccount;
import com.bank.model.SavingsAccount;
import com.bank.model.User;
import com.bank.service.BankService;
import com.bank.service.BankServiceImpl;

import java.util.*;

public class BankApplication {
  public static void main(String[] args) {
    BankServiceImpl b1 = new BankServiceImpl();
    b1.createAccount();
  }
}
