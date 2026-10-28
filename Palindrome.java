public class Palindrome {

	public static void main (String[] args) {
		String s = "taco cat";
		
		removespace(s);
		willitletter(s);
		isPalindrome(s);
	System.out.println("Is " + s + " a Palindrome? " + isPalindrome(s)) ;
	

}

	public static boolean removespace (String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i) != ' ') {
		result += s.charAt(i);
	}
}
return result;

	
	
	
	
	
	
	public static boolean isPalindrome (String s) {
		for (int i = 0; i < s.length()/2; i++) {
	
	if (s.charAt(i) != s.charAt(s.length() -1-i)) {
	return false;
}
}
	return true;
	
}
	
	


	
	public static boolean willitletter (String s) {
		for ( int i = 0; i < s.length(); i++) {
	String nonLetters = ",.:;()[]{}!@#$%^&* ";
		int chara = s.charAt(i);
		if (nonLetters.indexOf(chara) != 1) {
	return false;
	}
}
	return true;
}

}
