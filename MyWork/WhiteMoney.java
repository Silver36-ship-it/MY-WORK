import java.util.Scanner;
public class WhiteMoney {
public static void main(String [] args) {
Scanner input = new Scanner(System.in);
System.out.println("Give me any number:");
int Numb1 = input.nextInt();
System.out.println("Give me another number:");
int Numb2 = input.nextInt();
int sum = Numb1 + Numb2;
int difference = Numb2 - Numb1;
int Square1 = Numb1 * Numb1;
int Square2 = Numb2 * Numb2;
int SumOfSquare = Square1 + Square2;
int DifferenceOfSquare = Square2 - Square1;
System.out.printf("Sum is %d%n", sum);
System.out.printf("Difference is %d%n", difference);
System.out.printf("Sum of 1st Square is %d%n", Square1);
System.out.printf("Sum of 2nd Square is %d%n", Square2);
System.out.printf("Sum of Both Squares: %d%n", SumOfSquare);
System.out.printf("Differences of Squares: %d%n", DifferenceOfSquare);
 
}
} 