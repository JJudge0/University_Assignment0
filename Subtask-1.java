public static String Add(String one, String two)  // Addition Operation
{
		/// function returns string for adding two numbers.
		double num1 = Double.parseDouble(one);
		double num2 = Double.parseDouble(two);
		return String.valueOf("answer = "+(num1+num2));
}


	public static String Sub(String one, String two)  // Subtraction Operation
{
		double num1 = Double.parseDouble(one);
		double num2 = Double.parseDouble(two);
  	return String.valueOf("answer = "+(num1-num2));
}


	public static String Divide(String one, String two) // Division Operation
{
		double num1 = Double.parseDouble(one);
		double num2 = Double.parseDouble(two);
		double answer=num1/num2;
		return String.valueOf(num1/num2);
}


public static String multiply(String one, String two) // Multiplication
{
		double first=Double.parseDouble(one);
		double second=Double.parseDouble(two);
		return String.valueOf(first*second);
}
