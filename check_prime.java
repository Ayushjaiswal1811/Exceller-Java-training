import java.util.*;
class check_prime{
  public static void main(String[] args)
  {
    int number;
    boolean isPrime=true;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    number = sc.nextInt();
    for(int i=2;i<=number/2;i++){
      if(number%i==0){
        isPrime=false;
        break;
      }
    }
    if(isPrime==true){
      System.out.println("The number is prime.");
    } else {
      System.out.println("The number is not prime.");
    }
  }
}