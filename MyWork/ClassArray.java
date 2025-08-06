import java.util.Arrays;
public class ClassArray{
public static void main(String [] args) {
int [] [] score = {{32,33},{44,32},{76,43}};

for (int row = 0; row < score.length; row++) {
System.out.println(Arrays.toString(score[row]));
}
}
}