import java.util.Scanner;

public class wordLines {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // creates scanner for user input
		String phrase = scan.nextLine();// takes value from scanner and sets it to phrase
		String result = ""; // initiates a result variable
		int nonBlank = 0; // initiates a nonBlank variable
		for (int i = 0; i < phrase.length(); i++) { // iterates for every character inside of phrase
			if (phrase.substring(i, i + 1).equals(" ")) {// if the character is a space it adds a new line to result
															// instead of the space
				result = result + "\n";

			} else {
				result = result + phrase.substring(i, i + 1); // if the character is not a space, it just adds the
																// character and adds to the nonBlank variable
				nonBlank++;

			}

		}
		System.out.println(result); // prints the new result
		System.out.println("Your input has " + nonBlank + " non-blank characters."); // prints the number of nonBlank
																						// characters
	}
}
