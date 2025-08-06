import java.util.Scanner;

    public class InputFive {
   public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
     System.out.print("Put a whole number:");
  int number1 = input.nextInt() ;
     System.out.print("Put another whole number:");
   int number2 = input.nextInt() ;
      System.out.print("Put any other whole number:");
   int number3 = input.nextInt() ;
      System.out.print( "Put any other whole number:");
   int number4 = input.nextInt() ;
      System.out.print( "Put any other whole number:");
   int number5 = input.nextInt() ;
  int largest = number1 ;
    if(largest < number2) largest = number2;
  if(largest < number3) largest = number3;
   if(largest < number4) largest = number4;
     if(largest < number5) largest = number5;
      System.out.printf("largest is %d", largest);
  
    int secondlargest = Integer.MIN_VALUE;
    if(number1 != largest && number1 > secondlargest) secondlargest = number1;
    if(number2 != largest && number2 > secondlargest) secondlargest = number2;
    if(number3 != largest && number3 > secondlargest) secondlargest = number3;
    if(number4 != largest && number4 > secondlargest) secondlargest = number4;
    if(number5 != largest && number5 > secondlargest) secondlargest = number5;
     System.out.printf("SecondLargest is %d", secondlargest);
   }
   
   }