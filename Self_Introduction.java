
public class Self_Introduction {
  public static void main(String[] args) {
      student S1 = new student("Ayush", 20, "CS22183", "Computer Science");
      /*Scanner sc=new Scanner(System.in);
      System.out.print("Enter your Name: ");
      S1.name=sc.nextLine();
      System.out.print("Enter your Roll number: ");
      S1.roll_no=sc.nextLine();
      System.out.print("Enter your Age: ");
      S1.age=sc.nextInt();
      System.out.print("Enter your Branch: ");
      S1.branch=sc.nextLine();
      */
      S1.introduceYourself();
        S1.set_marks(88);
        S1.get_marks();
        S1.result();
  }
 }
class student{
      String name ;
      int age ; 
      String roll_no ;
      String branch;
      private int marks;
      student(String name, int age, String roll_no, String branch){
          this.name = name;
          this.age = age;
          this.roll_no = roll_no;
          this.branch = branch;
      }
        void set_marks(int marks){
            this.marks=marks;
        }
        int get_marks(){
            return this.marks;
        }

        void result(){
          if(this.marks>=35){
              System.out.println(this.name + " have passed the exam.");
          }
          else{
              System.out.println(this.name + "You have failed the exam.");
          }
        }
      void introduceYourself(){
          System.out.println("Hello, my name is " + name + ".");
          System.out.println("I am " + age + " years old.");
          System.out.println("My roll number is " + roll_no + ".");
          System.out.println("I am studying in the " + branch + " branch.");
      }
    }
