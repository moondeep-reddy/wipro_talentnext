package wipro;
import java.util.Scanner;
public class problem4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		int a = sc.nextInt();
		if (a > 0) {
			System.out.print("positive");
		} else if (a < 0) {
			System.out.print("negitive");
		} else {
			System.out.println("The number is 0");
		}
	}
}
