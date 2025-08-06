import java.util.Scanner;
 public class Letter {
  public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
  System.out.println("Enter a letter:");
 char letter = input.next().charAt(0);
 if(Character.isLetter(letter)) {
  if(letter == 'A' ||letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' ||letter == 'u') {
   System.out.println("Letter " + letter + " is vowel");
   } else if {
   System.out.println("Letter " + letter + " is consonant");
   }
   } else {
     System.out.println("Input is invalid");
     }
   }
   }