import java.time.LocalDateTime;
import java.util.*;
class Wallet{
  public static void main(String[] args) {
    Paytm myWallet = new Paytm();
    Scanner sc = new Scanner(System.in);
    int index1;
    String note;
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
          //System.out.print("Enter note about Transaction: ");
          note = "Credited "+add_amount+" to wallet Successfully.";
          myWallet.add_money(add_amount,note);
          System.out.println("Added " + add_amount + ". New balance: " + myWallet.get_balance());
          break;
        case 2:
          System.out.print("Enter amount to pay: ");
          double pay_amount = sc.nextDouble();
          // System.out.print("Enter note about Transaction: ");
          // note = sc.nextLine();
          note = "Paid "+pay_amount+" through wallet Successfully.";
          myWallet.pay(pay_amount,note);
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
        case 6:
          System.out.print("Enter page number: ");
          int page = sc.nextInt();
          System.out.print("Enter limit per page: ");
          int limit = sc.nextInt();
          myWallet.fetch_transactions(page, limit);
          break;
        case 7:
          System.out.print("Enter transaction type (Credited/Paid): ");
          String type = sc.next();
          myWallet.transaction_by_type(type);
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
  // private String note;
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

  void add_money(double amount,String note){
    this.balance += amount;
    // this.note = note;
    add_transaction( "Credited" , (int)amount, note);
    // transactions[transaction_count] = "Added " + amount +LocalDateTime.now();
    // transaction_count++;
  }
  boolean pay(double amount,String note){
    if(this.balance >= amount){
      this.balance -= amount;
      // this.note = note;
      System.out.println("Payment of " + amount + " is successful.");
      System.out.println("Remaining balance: " + this.balance);
      add_transaction( "Paid " , (int)amount, note);
      // transactions[transaction_count] ="Paid " + amount + LocalDateTime.now();
      // transaction_count++; 
      return true;
    } else {
      System.out.println("Insufficient balance for payment of " + amount + ".");
      System.out.println("Current balance: " + this.balance);
      add_transaction( "Failed due to insufficient balance." , (int)amount, "Transaction Failed.");
      // transactions[transaction_count] ="Failed payment of " + amount +LocalDateTime.now();
      // transaction_count++;
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
    System.out.println("6. Fetch Transactions with Pages");
    System.out.println("7. Transactions by Type (Credited/Paid)");
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


  public void fetch_transactions(int page, int limit) {
    for (int i = 0; i < transaction_count; i++) {
        for (int j = 0; j < limit; j++){
          if( transactions[i] == null){
            System.out.println("No transactions available.");
          }else{
            int transactionIndex = (page - 1) * limit + j;
            if (transactionIndex < transaction_count) {
                System.out.println("Transaction " + (transactionIndex + 1) + ": " + transactions[transactionIndex]);
            } else {
                break;
            }
          }
        }
    }
  }

  public void increase_size(){
    int newTransactionsSize =transaction_count + transactions.length/2;
    String[] temp = new String[newTransactionsSize];
    for(int i=0; i<transaction_count; i++){
      temp[i] = transactions[i];
    }
    transactions = temp;
  }

  void add_transaction(String type, int amount1, String note){
    if(transaction_count == transactions.length){
      increase_size();
    }
  // transactions[transaction_count] = type + " " + amount1 + " on " + LocalDateTime.now();
  //   transaction_count++;
    Transaction transaction = new Transaction(type, amount1,this.balance,note);
    transactions[transaction_count] = transaction.get_record();
    transaction_count++;
  }

  void transaction_by_type(String type){
    System.out.println("Transactions of type: " + type);
    for(int i=0; i<transaction_count; i++){
      if(transactions[i].contains(type)==true){
        System.out.println((i+1) + ". " + transactions[i]);
      }
    }
  }

} 

class Transaction{
  String type;
  double amount;
  double balance;
  String note;
  int transaction_id=0;
  static int id_counter=1;
  LocalDateTime timestamp;

  Transaction(String type, double amount, double balance, String note){
    this.type = type;
    this.amount = amount;
    this.balance=balance;
    this.note=note; 
    transaction_id = id_counter++;
    this.timestamp = LocalDateTime.now();
  }
  Transaction(String type, double amount, double balance){
    this.type = type;
    this.amount = amount;
    this.balance=balance;
    transaction_id = id_counter++;
    this.timestamp = LocalDateTime.now();
  }
  public String get_record(){
    if (note!=null){
      return "Transaction ID: " + transaction_id + ", Type: " + type + ", Amount: " + amount + ", Balance after transaction: " + balance + ", Note: " + note + ", Timestamp: " + timestamp;
    }else{
    return "Transaction ID: " + transaction_id + ", Type: " + type + ", Amount: " + amount + ", Balance after transaction: " + balance + ", Timestamp: " + timestamp;
  }
  }
}

