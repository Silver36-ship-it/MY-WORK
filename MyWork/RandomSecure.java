import java.security.SecureRandom;
public class RandomSecure{
public static void main(String[] args) {
SecureRandom randomNumbers = new SecureRandom();
for(int i = 1; i <= 20; i++){

int generate = 1 + randomNumbers.nextInt(6);
System.out.print(generate +" ");
if(i % 5 == 0) {
System.out.println();

}
}
System.out.println("Table\tFrequency");
System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d", i,i,i,i,i); 

}
}