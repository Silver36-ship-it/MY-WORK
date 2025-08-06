public class ArrayLoopings {
public static void main(String[] args){
int number = 5;

for(int i = 1; i <= number; i++){
String line = "";
for(int space = 1; space <= number - i; space++){
line += " ";
}
for(int j = 1; j <= i; j++){
line += j;}
for(int k = i - 1; k >= 1; k--){
line += k;} 
System.out.println(line);
}
for(int i = number - 1; i >= 1; i--) {
String line = "";
for(int space = 1; space <= number - i; space++) {
line += " ";}
for(int j = 1; j <= i; j++) {
line += j;}
for(int k = i - 1; k >= 1; k--) {
line += k;}
System.out.println(line);
}
}
}