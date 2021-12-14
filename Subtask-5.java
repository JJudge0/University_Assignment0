public static void dectobin(String one)
  	// This code shows the decimal to binary function of given values
	{
		int mydecimal = Integer.parseInt(one);//one; // decimal number stored as int 
		int binaryArray[] = new int[32]; // maximum of 32 bits allocated to list 
		int index = binaryArray.length-1;  // indexing begins at the end of the list as that's where binary will be added
		while ((mydecimal) != 0) { //if the value of the input is not 0 proceed 
			binaryArray[index] = mydecimal % 2; // return the modulus of the decimal division 
			mydecimal = mydecimal /2; // divide the decimal by 2 and store its new value 
			index--; // reduce the indexing by 1 
		}
		for(int n : binaryArray) { //output every value within the array 
			System.out.println(n);
		}
	}
