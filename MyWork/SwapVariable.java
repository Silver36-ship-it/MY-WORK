import java.util.Scanner;
  public class SwapVariable {
 public static void main(String [] args) {
  Scanner input = new Scanner(System.in);
 System.out.print("Enter Integer(a):");
  int number1 = input.nextInt();
 System.out.print("Enter Integer(b):");
  int number2 = input.nextInt();
   System.out.printf("Integer(a) = %d%n", (number1 + number2) - number1);
    System.out.printf("Integer(b) = %d%n", (number1 + number2) - number2);
    }
    }