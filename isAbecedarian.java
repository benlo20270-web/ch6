public class isAbecedarian {
import java.util.Scanner;



public static void main (String[] args) {
	Scanner in = new Scanner(system.in);
	String word = in.nextLine();

	
	for (int i = 0;  i <= word.length() - 1; i++)
	
	if (word.charAt(i) > word.charAt(i + 1)) {
            return false;
            
            
            
		}
		
		
	}
	return true;
}
