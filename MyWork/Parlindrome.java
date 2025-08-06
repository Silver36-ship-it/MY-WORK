import java.util.Scanner;
 public class Parlindrome {
  public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
  System.out.println("Enter Series of 4 number: ");
    int number = input.nextInt();
      int d1 = (number / 1000);
    int d2 = (number%1000) / 100;
   int d3 = (number%100) / 10 ;
   int d4 = number%10 ;
   int twist1 = d1 + d2 ;
   int twist2 = twist1 - d2; 
   int twist3 = twist1 - d1;
   int twist4 = d2 + d3;
   int twist5 = twist4 - d2 ;
   int twist6 = d4 + d3 ;
   int twist7 = twist6 - d3;
   int d5 = twist7;
  int d6 = twist5;
  int d7 = twist3;
  int d8 = twist2;
    if(d1 == d5 && d2 == d6 && d3 == d7 && d4 == d8 || d4 != d8) {
   System.out.println("The number " + number + " is a palindrome");
   }
    else if(d1 == d5 && d2 == d6 && d3 != d7) {
    System.out.println("The number " + number + " is a palindrome");
    }
    else if(d1 == d5 && d2 == d6 && d3 != d7) {
    System.out.println("The number " + number + " is not a palindrome");
    }
     else if(d1 == d5 && d2 != d6 && d3 != d7) {
    System.out.println("The number " + number + " is not a palindrome");
    }
     else {
    System.out.println("The number " + number + " is not a palindrome");
    }
    }
    }