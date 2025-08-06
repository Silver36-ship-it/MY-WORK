import java.util.Scanner;
public class LipYer { public static void main(String[] args) {   
  Scanner input = new Scanner(System.in);     
   System.out.print("Enter a year: ");
   int year = input.nextInt();
 boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
  System.out.println("is " + year + " a leap year? " + isLeapYear);
 }
 }