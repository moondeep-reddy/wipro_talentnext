/*package wipro;
import java.util.Scanner;
public class problem10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the gender:");
		String gender = sc.nextLine();
		System.out.println("enter age ");
		int age = sc.nextInt();
		if((gender=="female") && (age> 0 && age<59)){
			System.out.println("the percentage of intrest is 8.2%");
		}else if((gender=="female")&&(age>59&& age<100)){
			System.out.println("the percentage of intrest is 9");
		}else if((gender =="male")&&(age>0&&age<58)) {
			System.out.println("the percentage of intrest is 8.4%");
		}
		else {
			System.out.println("the percentage of intrest is 10.5%");
		}
	}
}*/
package wipro;
import java.util.*;
public class problem10{
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String gender=sc.nextLine();
		int age=sc.nextInt();
		if((gender=="female")&&(age>0 && age<59)) {
			System.out.println("the percentage of intrest is 8.2%");
		}
		else if((gender=="female")&&(age>58 && age<101)) {
			System.out.println("the percentage of intrest is 9.2%");
		}
		else if((gender="male")&&(age>0 && age<59)) {
			System.out.println("the percentage of intrest is 8.4%");
		}
		else {
			System.out.println("the percentage of intrest is 10.5%");
		}
		sc.close();
		}
}