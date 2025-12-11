import java.time.LocalDateTime;
import java.util.*;
class Wallet{
  public static void main(String[] args) {
    Paytm myWallet = new Paytm();
    Scanner sc = new Scanner(System.in);
    int index1;
    System.out.print("Enter owner name: ");
    String name = sc.nextLine();
    myWallet.set_ownwer_name(name);
    System.out.print("Enter initial balance: ");
    double initial_balance = sc.nextDouble();
    myWallet.set_balance(initial_balance);
    System.out.println("Wallet created for " + myWallet.get_owner_name() + " with balance " + myWallet.get_balance());
    while(true){
      int choice = myWallet.enter_choice();
      switch(choice){
        case 1:
          System.out.print("Enter amount to add: ");
          double add_amount = sc.nextDouble();
          myWallet.add_money(add_amount);
          System.out.println("Added " + add_amount + ". New balance: " + myWallet.get_balance());
          break;
        case 2:
          System.out.print("Enter amount to pay: ");
          double pay_amount = sc.nextDouble();
          myWallet.pay(pay_amount);
          break;
        case 3:
          myWallet.check_balance();
          break;
        case 4:
          myWallet.transaction_history();
          break;
        case 5:
          System.out.print("Enter number of transaction to check: ");
          index1 = sc.nextInt();
          myWallet.check_transaction(index1 - 1);
          break;
        default:
          System.out.println("Invalid choice. Exiting.");
          return;
      }
    }
  }
}
class Paytm{
  private String owner_name;
  private double balance;
  private String[] transactions = new String[100];
  private int transaction_count = 0;

  // Paytm(String owner_name, double initial_balance){
  //   this.owner_name = owner_name;
  //   this.balance = initial_balance;
  // }

  void set_ownwer_name(String owner_name){
    this.owner_name = owner_name;
  }

  String get_owner_name(){
    return this.owner_name;
  }

  void set_balance(double amount){
    this.balance = amount;
  }

  double get_balance(){
    return this.balance;
  }

  void add_money(double amount){
    this.balance += amount;
    transactions[transaction_count] = "Added " + amount +LocalDateTime.now();
    transaction_count++;
  }
  boolean pay(double amount){
    if(this.balance >= amount){
      this.balance -= amount;
      System.out.println("Payment of " + amount + " is successful.");
      System.out.println("Remaining balance: " + this.balance);
      transactions[transaction_count] ="Paid " + amount + LocalDateTime.now();
      transaction_count++; 
      return true;
    } else {
      System.out.println("Insufficient balance for payment of " + amount + ".");
      System.out.println("Current balance: " + this.balance);
      transactions[transaction_count] ="Failed payment of " + amount +LocalDateTime.now();
      transaction_count++;
      return false;
    }
  }

  //  void pay(double amount){
  //   if(this.balance >= amount){
  //     this.balance -= amount;
  //     System.out.println("Payment of " + amount + " is successful.");
  //   } else {
  //     System.out.println("Insufficient balance for payment of " + amount + ".");
  //   }
  //   System.out.println("Remaining balance: " + this.balance);
  // }

  void check_balance(){
    System.out.println("Current balance: " + this.balance);
  }

  int enter_choice(){
    Scanner sc = new Scanner(System.in);
    System.out.println("1. Add Money");
    System.out.println("2. Pay");
    System.out.println("3. Check Balance");
    System.out.println("4. Complete Transaction History");
    System.out.println("5. Check Specific Transaction");
    System.out.print("Enter your choice: ");
    int choice = sc.nextInt();
    return choice;
  }

  void transaction_history(){
    System.out.println("Transaction History:");
    for(int i=0; i<transaction_count; i++){
      System.out.println((i+1) + ". " + transactions[i]);
    }
  }

  void check_transaction(int index){
    if(index >= 0 && index < transaction_count){
      for(int i=0; i<transaction_count; i++)
      System.out.println("Transaction " + (i+1) + ": " + transactions[i]);
    } else {
      System.out.println("Invalid transaction Number.");
    }
  }

}