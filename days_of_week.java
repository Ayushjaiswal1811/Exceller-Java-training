import java.util.*;
class days_of_week{
  public static void main(String[] arga){
    int day;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter day number(1-7): ");
    day=sc.nextInt();
    switch(day%7+1){
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      // default:
      //   System.out.println("Invalid day number");
      //   break;
    }
  }
}