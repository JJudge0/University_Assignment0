	public static void Conversion_Hexadecimal_to_Decimal()
	// This code shows the hexadecimal to decimal function of given values
	{   
		System.out.println("Conversion from Hexadecimal to Denary"); 
		System.out.println("Enter a Hexadecimal number: ");
		Scanner input2 = new Scanner( System.in );
        String Hexa=input2.nextLine();     
        input2.close();
		int Decimal=Integer.parseInt(Hexa,16);// Takes user input and passes through as Integer then runs it against the base 16 number system.
		Hexa = Hexa.toUpperCase();  //Puts the input as Upper case
		System.out.println("HexaDecimal Number Entered:"); 
		System.out.println(Hexa);  // Prints the users input as Capital Letter
		System.out.println("Hexadecimal to Denary Conversion is: ");
		System.out.println(Decimal);
		System.out.println("-----------------------");
	}
	
