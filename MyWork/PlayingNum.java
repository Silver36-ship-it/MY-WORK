import java.util.Scanner;
 public class PlayingNum {
public static void main(String [] args){
 Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = input.nextInt();
System.out.print("Enter a number: ");
int number2 = input.nextInt();
System.out.print("Enter a number: ");
int number3 = input.nextInt();
System.out.print("Enter a number: ");
int number4 = input.nextInt();
System.out.print("Enter a number: ");
 int number5 = input.nextInt();
  int largest =  Math.max(Math.max(number, number2), Math.max(number3, number4), number5);
  System.out.println("Largest is " + largest );
 }
 }
 