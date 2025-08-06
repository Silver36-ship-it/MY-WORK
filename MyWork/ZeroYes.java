import java.util.Scanner;
public class ZeroYes{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter number till its 0:");
int zero = input.nextInt();
int sum = 0;
while(zero != 0){
sum = zero + sum;
System.out.println("Enter number till i see 0:");
zero = input.nextInt();
}
System.out.print("Sum is" + sum);
}
}