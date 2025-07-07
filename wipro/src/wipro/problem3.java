package wipro;
import java.util.Scanner;
public class problem3 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		int a = sc.nextInt();
		System.out.print("Enter the another number");
		int b = sc.nextInt();
		int x = a+b;
		System.out.print("the sum of "+a+" and "+b+" is "+x);
	}
}
