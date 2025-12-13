import java.util.Scanner;
class count_all_digit_of_number{
  public static void main(String[] args) {
      int num;
      int count=0;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a number: ");
      num=sc.nextInt();
      while(num!=0){
          num=num/10;
          count++;
      }
      System.out.println("Total digits: "+count);
  }
}