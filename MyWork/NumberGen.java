import java.util.Scanner;
 public class NumberGen {
public static void main(String [] args) {
 int number11 = (int) (System.currentTimeMillis() % 10);
 int number12 = (int) (System.currentTimeMillis() / 7 % 10);
 Scanner input = new Scanner(System.in);
System.out.println("What is " + number11 + " + " + number12 + " ? ");
 int number = input.nextInt();
 int sum = number11 + number12;
if(number == (number11 + number12)) {
System.out.println(number11 + " + " + number12 + " = " + number);
System.out.println("True");
}
else if(number != (number11 + number12)) {
System.out.println(number11 + " + " + number12 + " = " + number);
System.out.println("False! The correct answer is " + sum);
}
 }
}