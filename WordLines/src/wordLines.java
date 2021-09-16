import java.util.Scanner;
public class wordLines {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String phrase = scan.nextLine();
		String result = "";
		int nonBlank = 0;
		for( int i = 0 ; i < phrase.length(); i++) {
			if(phrase.substring(i,i+1).equals(" ")) {
				result = result + "\n";
				
			}
			else {
				result = result + phrase.substring(i,i+1);
				nonBlank++;
				
			}
			
		}
		System.out.println(result);
		System.out.println("Your input has "+ nonBlank +" non-blank characters.");
	}
}
