public class HelpArrayLoop {
public static void main(String[] args) {
int [] [] number1 = {{12,21,4},{3,42,11}};
int [][] number2 = {{23,42,11},{32},{21,2,4}};

System.out.println("Values in Number1 by row are");
outputArray(number1);
System.out.printf("%nValues in Number2 by row are%n");
outputArray(number2);
}

public static void outputArray(int [] [] number) {
for(int row = 0; row < number.length; row++) {
System.out.println(row);
for(int column = 0; column < number[row]. length; column++) {
	//System.out.printf("%d ", number[row][column]);
}
	//System.out.println();
}
}
}




































//int[] numbers = new int[20];
//int[] number = {23,21,12,34,3,22};
//System.out.printf("%s%8s%n", "Index", "VAlue");
	//int addTwo = 0;
	//for(int i = 0; i < numbers.length; i++){
	//addTwo += 2;
	
	//System.out.printf("%6d%8d%n", i, addTwo);
	//}
	//}
	//}
//int [] [] b = new int[3];
//b[0] = new int[5];
//b[1] = new int[3];