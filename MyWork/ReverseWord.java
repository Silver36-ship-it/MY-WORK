public class ReverseWord {

public static String Reverse(String firstWord, char letter) {

int i;

for (i = 0; i <= firstWord.length(); i++){

	if (firstWord.charAt(i) == letter){
	
	
	
	}break;
	
	
}

if (i == firstWord.length()){
	
	return firstWord;
}

String reverse = " ";


for (int j = i; j >= 0; j--){

reverse += firstWord.charAt(j);
}

for (int j = i + 1; j < firstWord.length(); j++) {

reverse += firstWord.charAt(j);
}

	return reverse;

}


public static void main(String... args) {
String firstWord = "Tosin";
char letter = 's';
String result = Reverse(firstWord, letter);

System.out.println(result);
}



}