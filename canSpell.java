public class canSpell {

public static void main (String[] args) {
String given = "quijibo";
String word = "jig"
System.out.println("Can " + given + " spell " + word + "? " + canSpell(given, word));

}

public static boolean canSpell (String given, String word) {
	for (int i = 0; i = given.length(); i++)
		char.letter = wor.charAt(i)
	int index = given.indexOf(letter);
            
            if (index >= 0) {
                
                given = given.substring(0, index) + given.substring(index + 1);
            } else {
                return false; 
            }
        }
        return true;
    }
