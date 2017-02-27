import java.util.Scanner;

public class calculation {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter current yearly tuition rate.");
		double tuition = scanner.nextDouble();
		System.out.println("Enter yearly percentage increase");
		double rate = scanner.nextDouble();
		
		double totalCost = 0;
		for(double years = 1; years <= 4; years++){
			totalCost += tuition;
			tuition = tuition + tuition * rate;
		}
		System.out.printf("The total cost of college tuition over 4 years will be $%.2f", totalCost);
	}

}
