import java.util.Scanner;
class Array_sum{
  public static void main(String[] args) {
    int n;
    System.out.println("Enter Number of elements of :");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int[] numbers = new int[5];
    System.out.println("Enter Array elements:");
    for(int i = 0; i < n; i++) {
      numbers[i] = sc.nextInt();
    }
    int sum = 0;
    for(int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    System.out.println("Sum of array elements: " + sum);
  }
}