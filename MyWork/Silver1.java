import java.util.Scanner;
public class Silver{
static Scanner input = new Scanner(System.in);
//A function that prompts user input
public static int getScore(){
while (true){
	System.out.println("Enter score");
	int score = input.nextInt();
	if (score < 0 || score > 100)
	System.out.println("Invalid input");
	else{
		return score;
		}
		}
		}

//A function that grades the score 
public static char calculate_grade(int score){
	if(score >= 90)
	return 'A';
	else if(score >= 70)
		return 'B';
	else if(score >= 50)
		return 'C';
	else if(score >= 40)
		return 'D';
	else{
		return 'F';
		}
		}
//A function that gives feedback
public static String getFeedback(char grade){
	if(grade == 'A')
		return "Excellent performance";
	else if(grade == 'B')
		return "Good job,keep improving";
	else if(grade == 'C')
		return "Fair effort,keep working on it";
	else if(grade == 'D')
		return "You can do better, do not give up";
	else{
		return "Needs improvement,ask for help";
		}
		}

public static void main(String[] args){
Scanner input = new Scanner(System.in);
String tryAgain;
do {
int score = getScore();
char grades = calculate_grade(score);
String feedback = getFeedback(grades); 
System.out.println("Your grade is " + grades);
System.out.println("My feedback for you is: " +feedback);
System.out.println("Wish to check for another score ? press yes or press any other key to quit: ");
			tryAgain = input.nextLine();
	} while (tryAgain.equals("yes"));
	System.out.println("Alright bye");
	}
}