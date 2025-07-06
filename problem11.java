package wipro;
import java.util.Scanner;
public class problem11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string");
		char input = sc.next().charAt(0);
		if (Character.isUpperCase(input)) {
			System.out.print(Character.toLowerCase(input));
		} else if (Character.isLowerCase(input)) {
			System.out.print(Character.isUpperCase(input));
		}
	}
}
