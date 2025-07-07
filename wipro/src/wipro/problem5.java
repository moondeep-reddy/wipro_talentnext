package wipro;
import java.util.Scanner;
public class problem5 {
	public static boolean numbers(int a,int b){
		return (a%10)==(b%10);
	}
	public static void main(String args[]) {
	System.out.println("->"+numbers(7,17));
	System.out.println("->"+numbers(6,17));
	System.out.println("->"+numbers(3,113));
	}
}
