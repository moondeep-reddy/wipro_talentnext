package wipro;
public class problem13 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("please enter the moth in number:");
			return;
		}
		try {
			int month = Integer.parseInt(args[0]);
			switch (month) {
			case 1: System.out.println("jan");break;
			case 2: System.out.println("feb");break;
			case 3: System.out.println("mar");break;
			case 4: System.out.println("apr");break;
			case 5: System.out.println("may");break;
			case 6: System.out.println("jun");break;
			case 7: System.out.println("jul");break;
			case 8: System.out.println("aug");break;
			case 9: System.out.println("sep");break;
			case 10: System.out.println("oct");break;
			case 11: System.out.println("nov");break;
			case 12: System.out.println("dec");break;
			default:System.out.println("Invalid month");
			}
	    } catch(NumberFormatException e) {
	    	System.out.println("Invalid input.Please enter a number.");
	    }
	}
}
