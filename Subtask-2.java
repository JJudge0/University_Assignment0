  public static String square(String one)
	{		
		// This code shows squared powers
		double num1 = Double.parseDouble(one);
		return String.valueOf(num1*num1);
	}

	public static String cubed(String one)
	{		
		// This code shows cubed powers
		double num1 = Double.parseDouble(one);
		return String.valueOf(num1*num1*num1);
	}

	public static String  modulo(String one, String two)
	// This function returns remainder and quotient for modulo function
	{
		double dividend = Double.parseDouble(one);
		double divisor = Double.parseDouble(two);
		double Quotient = dividend / divisor;
		double Remainder = dividend % divisor;
		return String.valueOf(Remainder);	    
	}

	public static String sqrt(String one)
	{
		double num1 = Double.parseDouble(one);
		// This code shows the square root function of given values
		double sqrtans = Math.sqrt(num1);
		return String.valueOf(sqrtans);

	}   

	public static String cbrt(String one)
	{
		// This code shows the cube root function of given values
		double num1 = Double.parseDouble(one);
		double cbrtresult = Math.cbrt(num1);
		return String.valueOf(cbrtresult);
	}
