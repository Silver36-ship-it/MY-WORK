import java.util.Scanner;
 public class TaxWahala {
public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
System.out.println("Enter 0 for single filers," + " 1 for married filing jointly or qualified widow(er), " + " 2 for married filing separately, and " +
 " 3 for head of household: ");
 double number = input.nextDouble();
 
 System.out.println("Enter taxable income: ");
  double number1 = input.nextDouble();
  double tax = 0;
  
  // for single filers
 if(number == 0) {
 if(number1 <= 8350)
 tax = number1 * 0.10;
 else if(number1 <= 33950) 
 tax = number1 * 0.10 + (number1 - 8350) * 0.15;
 else if(number1 <= 82250) 
 tax = number1 * 0.10 + (number1 - 8350) * 0.15 + (number1 - 33950) * 0.25;
 else if(number1 <= 171550) 
 tax = number1 * 0.10 + (number1 - 8350) * 0.15 + (number1 - 33950) * 0.25 + (number1 - 82250) * 0.28;
 else if(number1 <= 372950) 
 tax = number1 * 0.10 + (number1 - 8350) * 0.15 + (number1 - 33950) * 0.25 + (number1 - 82250) * 0.28 + (number1 - 171550) * 0.33;
 else
  tax = number1 * 0.10 + (number1 - 8350) * 0.15 + (number1 - 33950) * 0.25 + (number1 - 82250) * 0.28 + (number1 - 171550) * 0.33 + (number1 - 372950) * 0.35;
    System.out.println("Tax is " + tax);
   }
   }
   }
  
 