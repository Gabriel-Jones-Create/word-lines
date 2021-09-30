import java.util.Scanner;

public class wordLines {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // creates scanner for user input
		String phrase = scan.nextLine();// takes value from scanner and sets it to phrase
		String result = ""; // initiates a result variable
		int nonBlank = 0; // initiates a nonBlank variable

		// iterates for every character inside of phrase
		for (int i = 0; i < phrase.length(); i++) {
			// if the character is a space it adds a new line to result instead of the space
			if (phrase.substring(i, i + 1).equals(" ")) {
				result = result + "\n";

			}

			/* if the character is not a space, it just adds the character and adds to the
			 nonBlank variable */
			else {
				result = result + phrase.substring(i, i + 1);
				nonBlank++;
			}
		}
		// prints the new result
		System.out.println(result);

		// prints the number of nonBlank characters
		System.out.println("Your input has " + nonBlank + " non-blank characters.");
	}
}
