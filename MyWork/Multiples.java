import java.util.Scanner;
 public class Multiples {
  public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
  System.out.println("Enter an Integer:");
    int number = input.nextInt();
   if(number % 6 == 0 || number % 7 == 0) {
    System.out.println("Number is a multiple of 6 or a multiple of 7");
    }
       else {
     System.out.println("Neither number is a multiple of 6 or 7");
     }
     }
     }
