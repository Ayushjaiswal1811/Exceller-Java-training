import java.util.*; 
class result{
  public static void main(String args[]){
    int marks;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your marks: ");
    marks = sc.nextInt();
    // if (marks>100 || marks<0){
    //   System.out.println("Invalid marks entered");
    //   return;
    // }
    // else if(marks>=90){
    //   System.out.println("Grade A");
    // }
    // else if(marks>=70){
    //   System.out.println("Grade B");
    // }else if(marks>=50){
    //   System.out.println("Grade C"); 
    // }else if(marks>=35){
    //   System.out.println("Grade D");
    // }
    // else{
    //   System.out.println("Fail result");
    // }
    switch(marks/10){
      case 10:
      case 9:
        System.out.println("Grade A");
        break;
      case 8:
      case 7:
        System.out.println("Grade B");
        break;
      case 6:
      case 5:
        System.out.println("Grade C");
        break;
      case 4:
      case 3:
        System.out.println("Grade D");
        break;
      default:
        System.out.println("Fail result");
    }
  }
}