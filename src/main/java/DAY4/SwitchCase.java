package DAY4;

public class SwitchCase {

	private static final int case1 = 0;

	public static void main(String[] args) {
		
		int weekno=1;
		
		switch(weekno) 
		{
		case1: System.out.println("Sunday"); break;
		case2: System.out.println("Monday"); break;
		case3: System.out.println("Tuesday"); break;
		case4: System.out.println("Wednsday"); break;
		case5: System.out.println("Thursday"); break;
		case6: System.out.println("Friday"); break;
		case7: System.out.println("Saturday"); break;
		default: System.out.println("Invalid week number");
		}

	}

}
