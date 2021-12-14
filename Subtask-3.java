	public static String tofaren(String one) 
  // This function shows the conversion from celsius to frenheit.
	{
		double celcius=Double.parseDouble(one);
		double d= 1.8;
		double f;
		f=(celcius*d)+32;
		return String.valueOf(one+"°C = "+f+"°F");
	}

	public static String toCelcius(String one) 
  // This function shows the conversion from frenheit to celsius.
	{
		double c;
		double f=Double.parseDouble(one);
		c=(f-32)/1.8;
		return String.valueOf(one+"°F = "+c+"°C");
	}
