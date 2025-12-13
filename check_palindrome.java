import java.util.Scanner;
class check_palindrome{
  public static void main(String[] args)
  {
    // int number;
    // int reversedNumber = 0;
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    // number = sc.nextInt();
    // while(number != 0){
    //   int last_digit = number % 10;
    //   reversedNumber = reversedNumber * 10 + last_digit;
    //   number = number / 10;
    // }
    // boolean isPalindrome = (number == reversedNumber);
    // if(isPalindrome==true){
    //   System.out.println("The number is a palindrome.");
    // } else {
    //   System.out.println("The number is not a palindrome.");
    // }
    String str;
    String rev="";
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string: ");
    str=sc.nextLine();
    int i = 0;
    int j=str.length()-1;
    // int flag=1;
    while(i != j){
      if(str.charAt(i)!=str.charAt(j))
      {
        System.out.println("The string is not a palindrome.");
        // flag=0;
        break;
      }
      i++;
      j--;
    }
    // if(flag==1){
      System.out.println("The string is a palindrome.");
    }
  }
