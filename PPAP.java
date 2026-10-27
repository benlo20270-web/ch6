public class PPAP {
	



public static void main (String[] args) {
	String Sentence ="I have a Gap, I have a Bap";
	int objact1 = Sentence.indexOf(',');
	String Object1 = Sentence.substring(9,objact1);
	int objact2 = Sentence.lastIndexOf(' ');
	String Object2 = Sentence.substring(objact2 + 1);
	 
	
	
	
	
	
	
	System.out.print("Uh!" + Object1 + Object2);
	
}
	
	
	
	
	
	
	
	
}
