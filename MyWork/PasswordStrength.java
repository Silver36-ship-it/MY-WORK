import java.util.Scanner;
public class PasswordStrength{
static Scanner input = new Scanner(System.in);
public static String getPassword(){
	System.out.print("Enter passcode:");
	String userInput = input.nextLine();
return userInput;
} 

public static int[] checkComplexity(String password){
	int alphaCount = 0;
	int numberCount = 0;

for(int i = 0; i < password.length(); i++) {
char numberOfCharacter = password.charAt(i);
	if(Character.isLetter(numberOfCharacter)){
	alphaCount++;}
	else if(Character.isDigit(numberOfCharacter)){
	numberCount++;}
}
	return new int[]{alphaCount, numberCount};
	}
	
public static String evaluateStrength(int alphaCount, int numberCount){
	if (alphaCount < 5 || numberCount == 0){
		return "Weak passcode";}
	else if (alphaCount >= 5 && alphaCount <= 8 && numberCount >= 1){
		return "Moderate passcode";}
	else if (alphaCount > 8 && numberCount >= 2){
		return "Strong passcode";}
	else{
		return "Weak passcode";
	}
	}
	
public static void main(String[] args){
Scanner input = new Scanner(System.in);
String tryAgain;
do {
	String password = getPassword();
	int[] check = checkComplexity(password);
	int alphaCount = check[0];
	int numberCount = check[1];
	String strength = evaluateStrength(alphaCount, numberCount);
	System.out.println("Number of alphabet is " + alphaCount);
	System.out.println("Number of digit is " + numberCount);
	System.out.println(strength);
	System.out.println("Wish to check for another passcode ? press yes or press any other key to quit: ");
	tryAgain = input.nextLine();
	} while (tryAgain.equals("yes"));
		System.out.println("Alright bye");
}
}
	
	