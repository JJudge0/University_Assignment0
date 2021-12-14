import java.util.Scanner;

public class HelloWorld // File Name - DON'T DELETE
{


	public static void main(String[] args)
	{
		square();
		cubed();
		modulo();
		sqrt();
	}
	

	public static void square()
	{		
	// This code shows squared powers
			double a;
			a=2;
			double b; // The datatype is double and contains decimal numbers.
			b=2;
			System.out.println(Math.pow(a,b));
	}
	
	
	public static void cubed()
	{		
	// This code shows cubed powers
			double a;
			a=2;
			double b; // The datatype is double and contains decimal numbers.
			b=3;
			System.out.println(Math.pow(a,b));
	}
	

	public static void modulo()
	{
	// This code shows modulo
		double c;
		c=4;
		double d;// The datatype is double and contains whole numebers
		d=5;
		System.out.println(c % d);
	}
	
	public static double squareRoot(int number) {
	    double temp;

	    double sr = number / 2;

	    do {
	        temp = sr;
	        sr = (temp + (number / temp)) / 2;
	    } while ((temp - sr) != 0);

	    return sr;
	    }

	    public static void sqrt()  
	    { 
	    System.out.print("Enter any number:");
	    Scanner scanner = new Scanner(System.in);
	    int num = scanner.nextInt(); 
	    scanner.close();

	    System.out.println("Square root of "+ num+ " is: "+squareRoot(num));
	    } 
	
	}
