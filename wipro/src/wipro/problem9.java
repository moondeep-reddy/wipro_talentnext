package wipro;
import java.util.Scanner;
public class problem9 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character");
		char ch = sc.next().charAt(0);
		if (Character.isLetter(ch)) {
			System.out.println("Alphabet");
		} else if (Character.isDigit(ch)) {
			System.out.println("Digit");
		} else {
			System.out.println("Special symbol");
		}
	}
}
