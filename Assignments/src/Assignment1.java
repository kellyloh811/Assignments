import java.util.*;
public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("1.");
				
		System.out.print("Enter your name :");
		String name = in.next();
		System.out.println("Name :" + name);
		
		System.out.print("Enter your age :");
		int age = in.nextInt();
		System.out.println("Age :" + age);
		
		System.out.print("Enter you gender :");
		char gender = in.next().charAt(0);
		System.out.println("Gender :" + gender);
		
		System.out.print("Enter your marital :");
		String marital = in.next();
		System.out.println("Marital status :" + marital);
		
		System.out.println();
		
		System.out.println("2.");
		System.out.print("Enter the investment provide :");
		String invest1 = in.next();
		String invest2 = in.next();
		String invest3 = in.next();
		String invest4 = in.next();
		String invest5 = in.next();
		System.out.println("Investment provide :" + invest1 + ", " + invest2 + ", " + invest3 + ", " + invest4 + ", " + invest5);
		System.out.println();
		
		System.out.println("3.");
		System.out.println("Price of investment	:");
		System.out.println("Price of per property		:760000");
		System.out.println("Price of per stock		:150");
		System.out.println("Price of gold per kg		:7600");
		System.out.println("Price of bonds per year		:98");
		System.out.println("Price of annuity per year	:1200");
		System.out.println();
		
		System.out.println("4.");
		System.out.print("Enter the number of investment:");
		int items = in.nextInt();
		System.out.print("Enter price of first investment:");
		double price1 = in.nextDouble();
		System.out.print("Enter quantity of first investment:");
		int quantity1 = in.nextInt();
		System.out.println();
		
		if (items<=2) {
			System.out.print("Enter price of second investment:");
			double price2 = in.nextDouble();
			System.out.print("Enter quantity of second investment:");
			int quantity2 = in.nextInt();
			System.out.println();
			
			System.out.println("5.");
			double totalprice = ((price1*quantity1) + (price2*quantity2));
			System.out.printf("Total price :RM%.2f" , totalprice);
			System.out.println();
			
			if (totalprice>1000000) {
				double discount = totalprice/100*10;
				System.out.printf("Discount received	:RM%.2f" , discount);
				System.out.println();
				double paid = totalprice-discount;
				System.out.printf("Price to be paid	:RM%.2f" , paid);
			}
			else {
				System.out.printf("Price to be paid	:RM%.2f" , totalprice);
			}
			
		}
		
	}

}
