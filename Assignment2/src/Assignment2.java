import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("1.");
			
		System.out.print("Enter your name :");
		String name = in.next();
		
		System.out.print("Enter your age :");
		String age = in.next();
		
		System.out.print("Enter you gender :");
		String gender = in.next();
		
		System.out.print("Enter your marital :");
		String marital = in.next();
		
		System.out.println();
		
		String[] personal1 = {"Name", "Age", "Gender", "Marital"};
		String[] personal2 = {name, age, gender, marital};
		int k=0;
		do {
			System.out.println(personal1[k] + "\t: " + personal2[k]);
		k++;
		}while(k<personal1.length);
		
		System.out.println();
		
		System.out.println("2.");
		System.out.print("Enter the investment provide :");
		String invest1 = in.next();
		String invest2 = in.next();
		String invest3 = in.next();
		String invest4 = in.next();
		String invest5 = in.next();
		
		System.out.println();
		
		String[] investmentprovide = {invest1, invest2, invest3, invest4, invest5};
		int a=0;
		while (a<investmentprovide.length) {
			System.out.println(investmentprovide[a]);
			a++;
		}
		
		System.out.println();
		
		System.out.println("3.");
		System.out.println("Price of investment	:");
		String[] investment = {"per property", "per stock", "gold per kg", "bonds per year", "annuity per year"};
		int [] price = {760000, 150, 7600, 98, 1200};
		
		for (int i=0; i<investment.length; i++) {
			System.out.print("Price of " + investment[i] + " : " + price[i]);
			System.out.println();
		}
		
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
			
			if (totalprice>100000) {
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
		
		if (items>2 && items<=3) {
			System.out.print("Enter price of second investment:");
			double price2 = in.nextDouble();
			System.out.print("Enter quantity of second investment:");
			int quantity2 = in.nextInt();
			System.out.println();
			
			System.out.print("Enter price of third investment:");
			double price3 = in.nextDouble();
			System.out.print("Enter quantity of third investment:");
			int quantity3 = in.nextInt();
			System.out.println();
			
			System.out.println("5.");
			double totalprice = (price1*quantity1) + (price2*quantity2) + (price3*quantity3);
			System.out.printf("Total price :RM%.2f" , totalprice);
			System.out.println();
			
			if (totalprice>200000) {
				double discount = totalprice/100*20;
				System.out.printf("Discount received	:RM%.2f" , discount);
				System.out.println();
				double paid = totalprice-discount;
				System.out.printf("Price to be paid	:RM%.2f" , paid);
			}
			else {
				System.out.printf("Price to be paid	:RM%.2f" , totalprice);
			}
			
		}
		
		
		if (items>3 && items<=4) {
			System.out.print("Enter price of second investment:");
			double price2 = in.nextDouble();
			System.out.print("Enter quantity of second investment:");
			int quantity2 = in.nextInt();
			System.out.println();
			
			System.out.print("Enter price of third investment:");
			double price3 = in.nextDouble();
			System.out.print("Enter quantity of third investment:");
			int quantity3 = in.nextInt();
			System.out.println();
			
			System.out.print("Enter price of fourth investment:");
			double price4 = in.nextDouble();
			System.out.print("Enter quantity of fourth investment:");
			int quantity4 = in.nextInt();
			System.out.println();
			
			System.out.println("5.");
			double totalprice = (price1*quantity1) + (price2*quantity2) + (price3*quantity3) + (price4*quantity4);
			System.out.printf("Total price :RM%.2f" , totalprice);
			System.out.println();
			
			if (totalprice>300000) {
				double discount = totalprice/100*30;
				System.out.printf("Discount received	:RM%.2f" , discount);
				System.out.println();
				double paid = totalprice-discount;
				System.out.printf("Price to be paid	:RM%.2f" , paid);
			}
			else {
				System.out.printf("Price to be paid	:RM%.2f" , totalprice);
			}
			
		}
		
		in.close();
	}

}
