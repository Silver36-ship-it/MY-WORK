import java.util.Scanner;
public class Range{
public static void main(String[] args){
int[] number =  new int[5];
number[0] = 2;
number[1] = 5;
number[2] = 4;
number[3] = 7;
number[4] = 1;
int largest = number[0];
int smallest = number[0];
if (largest < number[1]) largest = number[1];
if (largest < number[2]) largest = number[2];
if (largest < number[3]) largest = number[3];
if (largest < number[4]) largest = number[4];
System.out.println("Largets is " + largest);

if (smallest > number[1]) smallest = number[1];
if (smallest > number[2]) smallest = number[2];
if (smallest > number[3]) smallest = number[3];
if (smallest > number[4]) smallest = number[4];
System.out.println("Smallest is " + smallest);
int range = largest - smallest;
System.out.println("Answer is " + range);
}
}