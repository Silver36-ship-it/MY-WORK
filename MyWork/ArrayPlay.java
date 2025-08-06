import java.util.Scanner;
public class ArrayPlay{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter number:");
int number1 = input.nextInt();
System.out.println("Enter number:");
int number2 = input.nextInt();
System.out.println("Enter number:");
int number3 = input.nextInt();
System.out.println("Enter number:");
int number4 = input.nextInt();
System.out.println("Enter number:");
int number5 = input.nextInt();

int even = 0;
int odd = 0;

int[] score = {number1,number2,number3,number4,number5};
for (int i = 0; i < number.length ;i++){
	if (number[i] % 2 == 0) {
		even++;
	} else {
		odd++;}
 }
 System.out.println("Even numbers are " + even);
 System.out.println("Odd numbers are " + odd);
 }
 }
