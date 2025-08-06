import java.util.Scanner;
 public class QuadVariable {
  public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
  System.out.println("Enter first number(a):");
 double number1 = input.nextDouble();
  System.out.println("Enter second number(b):");
 double number2 =  input.nextDouble();
  System.out.println("Enter third number(c):");
 double number3 = input.nextDouble();
 double squareCalculation = (number2 * number2) - 4 * (number1 * number3);
  if(squareCalculation >= 0) {
  double square = Math.sqrt(squareCalculation);
 double negativeCalculation = -(number2 - square) / 2 * number1;
  double positiveCalculation = -(number2 + square) / 2 * number1;
   System.out.printf("x = %.2f%n", negativeCalculation);
   System.out.printf("x = %.2f%n", positiveCalculation);
   }
   
      else {
       System.out.println("There is no root");
   }
   }
   }