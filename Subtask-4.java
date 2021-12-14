  private static String inchToCm (String one) 
  // This code shows the inch to cm root function of given values
  {
		double inches=Double.parseDouble(one);
		double cm = inches * 2.54;
		return String.valueOf(inches + " inch = " + cm + "cm");		
  } 

	private static String cmToInch (String one) 
  // This code shows the cm to inch function of given values
  {
		double cm=Double.parseDouble(one);	
		double inch = cm / 2.54;
		return String.valueOf(cm + "cm = " + inch + " inches");
	}

	private static String ounceToGram (String one) 
  // This code shows the ounce to grams function of given values  
  {
		double ounce=Double.parseDouble(one);
		double gram = ounce * 28.349523125;
		return String.valueOf(ounce + " ounces = " + gram + " grams");
	}

	private static String gramToOunce(String one)
  // This code shows the grams to ounce function of given values
  {
		double gram =Double.parseDouble(one);
		double ounce = gram / 28.349523125;
		return String.valueOf(gram + " grams = " + ounce + " ounces");
	}	
