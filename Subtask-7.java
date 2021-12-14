	public static void  Conversion_Decimal_to_Hexadecimal()
		// This code shows the decimal to hexadecimal function of given values
	{
		Scanner input1 = new Scanner( System.in );
		System.out.println("Conversion from Denary to Hexadecimal");
		boolean check= false;
		String inputstring= ""; // Taken user input as string and runs through the int checker then it should pass the string as integer if the string is false is would display the error message
		while (check== false)  // Taken user input as string checks it by using a while loop
		{
			System.out.println("Enter a Denary number: ");
			inputstring=input1.nextLine();	
			if (intchecker2(inputstring)== true) // In-reverse so takes input of user runs it through the function method down below called "int checker" 
			{
				check= true;
			}
			else 
			{
				System.out.println("Entered INVALID input!!");
				System.out.println("---------------------");
				
			}
		}
		
		int DECTOHEX = Integer.parseInt(inputstring);// "parse int"- basically if it can convert to int it will
		int Remainder;     // For storing remainder
		String Output="";   // For storing result
		
		while(DECTOHEX>0)
		{ // Digits in hexadecimal number system
			char HexaDecimal[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			Remainder=DECTOHEX%16; 
			Output=HexaDecimal[Remainder]+Output; 
			DECTOHEX=DECTOHEX/16;
		}
		System.out.println("Denary Number Entered:"); // Displays users input
		System.out.println(inputstring);
		System.out.println("Denary to Hexadecimal Conversion is: "); // Displays the calculated output
		System.out.println(Output);
	
	}	

	public static boolean intchecker2(String number)    
		//this is a checker if the input of the user is incorrect it will ask the user to retype the correct input
	{     
		Boolean check2= false;
		try 
		{
		    Integer.parseInt(number); // Runs user input to see if string can be converted if not it returns false goes back to while loop and goes to the error message
			check2= true;
		}
		catch(NumberFormatException e) // Using format exception between to pass the String as a integer 
		{
			check2 = false;
		}
		return check2;
	}

