public class ArraySum {
public static void main(String[] args) {
int[] number = {0, 1, 2, 3, 4, 5, 6};
int total = 0;
for(int counter = 0; counter < number.length; counter++){
	total += number[counter];
	}
	System.out.print(total);
}
} 