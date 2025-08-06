import java.util.Scanner;
 public class StringPar {
public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
System.out.println("Enter characters: ");
 String charac = input.nextLine();
int low = 0;
int high = charac.length() - 1;
boolean palindrome = true;
 while(low < high) {
  if(charac.charAt(low) != charac.charAt(high)) {
   palindrome = false;
   }
 break;
 }
 low++;
 high--;
  if(palindrome)
   System.out.println(charac + " is a palindrome");
   else
    System.out.println(charac + " is not a palindrome");
    }
    }