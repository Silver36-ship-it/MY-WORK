import java.util.Scanner;
public class WhileWhy{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int random = (int) (Math.random() *5);
int choose = 0;
while(choose != random){
System.out.println("Choose between 0 and 4:");
choose = input.nextInt();
if (choose == random)
 System.out.println("correct number!");
 
 else if (choose < random)
 System.out.println("Lesser number,try again");
 
 else
 System.out.println("Go for another number");
 }
 }
 }