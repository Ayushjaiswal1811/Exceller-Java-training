import java.util.Scanner;
class reverse_a_string{
  public static void main(String[] args) {
    String str;
    //String rev="";
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string: ");
    str=sc.nextLine();
    if(str.length()==0){
      System.out.println("Empty string entered");
      return;
    }else{

      // for(int i=0; i<str.length(); i++){
      //   rev=str.charAt(i)+rev;
      // }
      // for(int i=str.length()-1; i>=0; i--){
     // rev=rev+str.charAt(i);
     String rev= reverse_string(str);
      System.out.println("Original string: "+str);
       System.out.println("Reversed string: "+rev);
    }
  }

  public static String reverse_string(String str){
    char[] chars = str.toCharArray();
    int left=0;
    int right=chars.length-1;
    while(left<right){
      char temp=chars[left];
      chars[left]=chars[right];
      chars[right]=temp;
      left++;
      right--;
    }
    return new String(chars);
  }
}