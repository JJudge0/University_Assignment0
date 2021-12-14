import java.util.Scanner;
public class Calculator {
// Multiplication and division
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	// user selects two numbers
	System.out.print("choose two numbers");
	System.out.println();
	double first = scanner.nextDouble();
	double second =scanner.nextDouble();
	// user chooses which operator they need to use
	System.out.print("choose the operator");
	System.out.println();
	char operator = scanner.next().charAt(0);
	double result;
		switch (operator) {
			case'*':
				result = first*second;
				System.out.print(first+"*"+second+"="+result);
				break;
			case '/':
				result = first/second;
				System.out.print(first+"/"+second+"="+result);
				break;
			default:
				System.out.println("Please choose the correct operator");
}
scanner.close();
}
}
