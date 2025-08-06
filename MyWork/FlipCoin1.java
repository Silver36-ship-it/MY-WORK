import java.util.Scanner;
 public class FlipCoin1 {
public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
 int generate = (int)(Math.random() * 2);
System.out.println("Enter 0 for Heads or 1 for Tails: ");
 int number = input.nextInt();
 if(number != 0 && number != 1) {
  System.out.println("Invalid guess");
  }

  else if(number == generate && generate == 0) {
   System.out.println("Correct! It's a Head");
   }
   else if(number == generate && generate == 1) {
    System.out.println("Correct! It's a Tail"); 
    }
  else {
   System.out.println("Incorrect! wrong guess");
  System.out.println("Enter 0 for Heads or 1 for Tails: ");
 int number1 = input.nextInt();
 if(number1 != 0 && number1 != 1) {
  System.out.println("Invalid guess");
  }

  else if(number1 == generate && generate == 0) {
   System.out.println("Correct! It's a Head");
   }
   else if(number1 == generate && generate == 1) {
    System.out.println("Correct! It's a Tail"); 
    }
  else {
   System.out.println("Incorrect! get lost");
   }
   }
   }
   } 