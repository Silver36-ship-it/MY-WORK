import java.util.Scanner;
 public class TimesNumber {
public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
System.out.println("Enter an Integer: ");
 int number = input.nextInt();
 int numberZero = 0 + 0;
 int numberOne = 1 + 0;
 int numberTwo = 2 + 2;
 int numberThree = 3 + 3 + 3;
 int numberFour = 4 + 4 + 4 + 4;
 int numberFive = 5 + 5 + 5 + 5 + 5;
 if(number < 0 || number > 5) {
    System.out.println("Invalid number");
    }
 if(number == numberZero) {
  System.out.println("The square is " + numberZero);
  }
  else if(number == numberOne) {
   System.out.println("The square is " + numberOne);
   }
   else if(number == 2) {
   System.out.println("The square is " + numberTwo);
   }
   else if(number == 3) {
    System.out.println("The square is " + numberThree);
    }
      else if(number == 4) {
    System.out.println("The square is " + numberFour);
    }
      else if(number == 5) {
    System.out.println("The square is " + numberFive);
    }
  }
  }