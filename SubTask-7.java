public static void  Conversion_Decimal_to_Hexadecimal()
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
