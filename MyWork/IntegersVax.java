import java.util.Scanner;
       public class IntegersVax {
  public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
     System.out.print("Put in any number:");
   int number1 = input.nextInt();
   
    System.out.print("Put in any number again:");
   int number2 = input.nextInt();
   
   if (number1 == number2) {
     System.out.printf("%d == %d%n", number1, number2);
     }
     if (number1 != number2) {
      System.out.printf("%d != %d%n", number1, number2);
       }
      if (number1 < number2) {
       System.out.printf("%d < %d%n", number1, number2);
       }
      if (number1 > number2) {
       System.out.printf("%d > %d%n", number1, number2);
       }
       if (number1 <= number2) {
        System.out.printf("%d <= %d%n", number1, number2);
        }
        if (number1 >= number2) {
         System.out.printf("%d >= %d%n", number1, number2);
         }
   }
}