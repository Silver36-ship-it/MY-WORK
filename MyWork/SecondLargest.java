import java.util.Scanner ;
   public class SecondLargest {
  public static void main(String [] args) {
Scanner input = new Scanner(System.in) ;
 System.out.println("Put a number:") ;
 int number1 = input.nextInt();
   System.out.println("Put another whole number:") ;
  int number2 = input.nextInt();
 System.out.println("Put another whole number:");
   int number3 = input.nextInt();
  System.out.println("Input another number:");
    int number4 = input.nextInt();
   int smallest = number1;
   int largest = number1;
  if(smallest > number2) smallest = number2;
  if(smallest > number3) smallest = number3;
  if(smallest > number4) smallest = number4;
  System.out.printf("Smallest is %d", smallest);
  if(largest < number2) largest = number2;
  if(largest < number3) largest = number3;
  if(largest < number4) largest = number4;
   System.out.printf("Largest is %d", largest);
  }
  }