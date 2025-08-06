import java.util.Scanner;
 public class LeapYear {
public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
System.out.println("Enter a year: ");
 int leap = input.nextInt();
  if(leap % 4 == 0 && leap % 100 != 0 ) {
  System.out.println("The year " + leap + " is a leap year");
  }
  else if(leap < 999) {
   System.out.println("Invalid year");
   }
    else if(leap % 100 == 0 && leap % 400 == 0){
    System.out.println("The year " + leap + " is a leap year");
   }
  else {
   System.out.println("The year " + leap + " is not a leap year");
   }
   }
   }