public class doubloon {

public static void main (String[] args) {
String s = "aabbcc";
System.out.println("Is " + s + " a Doubloon? " + isDoubloon(s)) ;

}

public static boolean isDoubloon (String s) {
for (int i = 0; i < s.length(); it+) {
char letter = s.charAt(i);
if (letterCount(s, letter) % 2!= 0)
	return false;

}

r	eturn true;

}



public static int letterCount(String s, char c) {
int sum = 0;
for (int i = 0; i < s.Length(); i++) {
char letter = s.charAt(i);
if (letter == c) sum++;


}
return true;
}

}
