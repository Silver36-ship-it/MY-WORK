import java.util.Scanner;
 public class Swapp {
public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
  System.out.println("Enter a number: ");
 int number = input.nextInt();
   System.out.println("Enter a number: ");
 int number1 = input.nextInt();
  System.out.println("Enter a number: ");
 int number2 = input.nextInt();
  System.out.println("Enter a number: ");
 int number3 = input.nextInt();
  if(number < number1){
 int temp = number;
  number = number1;
  number1 = temp;
  }
 System.out.println("first number is now " + number + " and second number is now " + number1);
 }
 }


  