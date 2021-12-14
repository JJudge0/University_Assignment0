	public static String bintodec(String one)
    // This code shows the binary to decimal function of given values
	{
		String binaryinput=one;
		int temporary_val = Integer.parseInt(binaryinput); //convert string to integer 
		int power = 0;
		int decimalnum = 0;
		while(temporary_val != 0) { // loop while input value is not equal to 0 
			int remainder = temporary_val % 10; // remainder of modulus 10 stored 
			decimalnum = decimalnum + (int)(remainder*Math.pow(2,  power)); 
			power ++; // increment power by 1 
			temporary_val = temporary_val / 10; // divide original input by 10 
		}
		return String.valueOf(decimalnum); //output final decimal value 
	}  	

