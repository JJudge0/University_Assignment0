package cs1701A0;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;

public class Mainframe extends JFrame {

	private JPanel contentPane;
	public JTextField num1field;
	public JTextField num2field;
	public JComboBox choosesum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainframe frame = new Mainframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mainframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		num1field = new JTextField();
		num1field.setBounds(10, 31, 188, 26);
		contentPane.add(num1field);
		num1field.setColumns(10);
		
		num2field = new JTextField();
		num2field.setBounds(255, 31, 155, 26);
		contentPane.add(num2field);
		num2field.setColumns(10);
		
		JLabel lblnum1 = new JLabel("Enter First Value");
		lblnum1.setBounds(10, 11, 113, 14);
		contentPane.add(lblnum1);
		
		JLabel lblnum2 = new JLabel("Enter Second Value");
		lblnum2.setBounds(269, 11, 123, 14);
		contentPane.add(lblnum2);
		
		JLabel lblChooseoption = new JLabel("Choose an operation from list below");
		lblChooseoption.setBounds(10, 96, 209, 14);
		contentPane.add(lblChooseoption);
		
		
		
		
		choosesum = new JComboBox();
		choosesum.addItem("Add");
		choosesum.addItem("Sub");
		choosesum.addItem("Multiply");
		choosesum.addItem("Divide");
		choosesum.addItem("Power");
		choosesum.addItem("Modulo");
		choosesum.addItem("Rooting");
		choosesum.addItem("Convert Temperature");
		choosesum.addItem("Convert Between Metric and Imperial");
		choosesum.addItem("Convert between number systems");
		choosesum.setSelectedItem(null);
		choosesum.setBounds(10, 121, 223, 22);
		contentPane.add(choosesum);
		

		
		
		
		choosesum.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(arg0.getStateChange()==ItemEvent.SELECTED) {
					String sumselection=(String) choosesum.getSelectedItem();
					switch(sumselection) {
					case "Rooting":
						JOptionPane.showMessageDialog(null, "In the field on the right Enter 1 in the box on the right for squaring your number or 2 for cubing", "Rooting", JOptionPane.INFORMATION_MESSAGE, null);
						break;
					
					case "Convert Temperature":
						JOptionPane.showMessageDialog(null, "In the field on the right Enter 1 for celcius to farenheight or 2 for farenheight to celcius", "Rooting", JOptionPane.INFORMATION_MESSAGE, null);
						break;
						
					case "Convert Between Metric and Imperial":
						JOptionPane.showMessageDialog(null, "In the field on the right Enter 1 - convert inch to cm, 2- cm to inch,3-ounce to gram, 4-gram to ounce", "Rooting", JOptionPane.INFORMATION_MESSAGE, null);
						break;
						
					case"Convert between number systems":
						JOptionPane.showMessageDialog(null, "In the field on the right Enter 1 - convert decimal to hexadecimal, 2- hexadecimal to decimal,3-decimal to binary, 4-binary to decimal","Convert between number systems",JOptionPane.INFORMATION_MESSAGE,null);
						break;	
						
						
						
						default:
						
						break;
					}
					
					}
				}
			
		});
		
		
		JLabel resultlabel = new JLabel("");
		resultlabel.setBounds(26, 213, 136, 22);
		contentPane.add(resultlabel);
		
		JButton btnsum = new JButton("Sum");
		
		btnsum.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if (choosesum.getSelectedItem()==null) {
					JOptionPane.showMessageDialog(null, "you must choose an operation from the list", "Error", JOptionPane.INFORMATION_MESSAGE, null);
				}

			
				String sumselection=(String) choosesum.getSelectedItem();
				
				
				String one = num1field.getText();// takes users input as a string, this is later converted into appropriate data type in the different functions
				String two = num2field.getText();
				
				
				
				
				
				switch(sumselection) {
				
				case "Add":
					resultlabel.setText(Add(one, two));
					try {
						TimeUnit.MICROSECONDS.sleep(300);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				int result=JOptionPane.showConfirmDialog(null,"Would you like to exit the program?", "Calculator",
				               JOptionPane.YES_NO_OPTION,
				               JOptionPane.QUESTION_MESSAGE);
				if(result == JOptionPane.YES_OPTION){
			               dispose();
					}
					break;
					
					
				case "Sub":
					resultlabel.setText(Sub(one,two));
					try {
						TimeUnit.MICROSECONDS.sleep(300);
					} catch (InterruptedException e5) {
						// TODO Auto-generated catch block
						e5.printStackTrace();
					}
				int result1=JOptionPane.showConfirmDialog(null,"Would you like to exit the program?", "Calculator",
			               JOptionPane.YES_NO_OPTION,
			               JOptionPane.QUESTION_MESSAGE);
				if(result1 == JOptionPane.YES_OPTION){
		               dispose();
					}
					break;
					
				case "Multiply":
					resultlabel.setText(multiply(one,two));
					try {
						TimeUnit.MICROSECONDS.sleep(300);
					} catch (InterruptedException e4) {
						// TODO Auto-generated catch block
						e4.printStackTrace();
					}
					int result2=JOptionPane.showConfirmDialog(null,"Would you like to exit the program?", "Calculator",
				               JOptionPane.YES_NO_OPTION,
				               JOptionPane.QUESTION_MESSAGE);
					if(result2 == JOptionPane.YES_OPTION){
			               dispose();
					}
					break;
					
					
				case "Divide":
					
					resultlabel.setText(Divide(one,two));
					try {
						TimeUnit.MICROSECONDS.sleep(300);
					} catch (InterruptedException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
					int result3=JOptionPane.showConfirmDialog(null,"Would you like to exit the program?", "Calculator",
				               JOptionPane.YES_NO_OPTION,
				               JOptionPane.QUESTION_MESSAGE);
					if(result3 == JOptionPane.YES_OPTION){
			               dispose();
					}
					break;
					
				case "Modulo":
					resultlabel.setText(modulo(one,two));
					try {
						TimeUnit.MICROSECONDS.sleep(300);
					} catch (InterruptedException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					int result4=JOptionPane.showConfirmDialog(null,"Would you like to exit the program?", "Calculator",
				               JOptionPane.YES_NO_OPTION,
				               JOptionPane.QUESTION_MESSAGE);
					if(result4 == JOptionPane.YES_OPTION){
			               dispose();
					}
					
					break;
					
					
					
					
					
				default:
					
					break;
					
					
					
				
				}
				
				
				if(choosesum.getSelectedItem().equals("Convert Temperature"))
				
				{
					
				if(num2field.getText().equals("1")) {
					resultlabel.setText(tofaren(one));
				}else if(num2field.getText().equals("2")) {
					resultlabel.setText(toCelcius(one));
					
				}else {
					JOptionPane.showMessageDialog(null, "Please enter a valid option", "Error", JOptionPane.INFORMATION_MESSAGE, null);
					
				}
				try {
					TimeUnit.MICROSECONDS.sleep(300);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				int result=JOptionPane.showConfirmDialog(null,"Would you like to exit the program?", "Calculator",
			               JOptionPane.YES_NO_OPTION,
			               JOptionPane.QUESTION_MESSAGE);
				if(result == JOptionPane.YES_OPTION){
		               dispose();
			}
				
				}
				if(choosesum.getSelectedItem().equals("Power")){
					
					if(num2field.getText().equals("1")) {
					resultlabel.setText(square(one));
				}else if(num2field.getText().equals("2")) {
					resultlabel.setText(cubed(one));
					
				}	else {
					JOptionPane.showMessageDialog(null, "Please enter a valid option", "Error", JOptionPane.INFORMATION_MESSAGE, null);
				}
					try {
						TimeUnit.MICROSECONDS.sleep(300);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					int result=JOptionPane.showConfirmDialog(null,"Would you like to exit the program?", "Calculator",
				               JOptionPane.YES_NO_OPTION,
				               JOptionPane.QUESTION_MESSAGE);
					if(result == JOptionPane.YES_OPTION){
			               dispose();
				}
				}
				
				if(choosesum.getSelectedItem().equals("Rooting"))
					
				{
				
				if(num2field.getText().equals("1")) {
					resultlabel.setText(sqrt(one));
				}else if(num2field.getText().equals("2")) {
					resultlabel.setText(cbrt(one));
					
				}else {
					JOptionPane.showMessageDialog(null, "Please enter a valid option", "Error", JOptionPane.INFORMATION_MESSAGE, null);
				}
				try {
					TimeUnit.MICROSECONDS.sleep(300);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				int result=JOptionPane.showConfirmDialog(null,"Would you like to exit the program?", "Calculator",
			               JOptionPane.YES_NO_OPTION,
			               JOptionPane.QUESTION_MESSAGE);
				if(result == JOptionPane.YES_OPTION){
		               dispose();
			}
					
				
				}
				
				if(choosesum.getSelectedItem().equals("Convert Between Metric and Imperial"))
					
				{
				
				if(num2field.getText().equals("1")) {
					resultlabel.setText(inchToCm(one));
				}else if(num2field.getText().equals("2")) {
					resultlabel.setText(cmToInch(one));
					
				}
				else if(num2field.getText().equals("3")) {
					resultlabel.setText(ounceToGram(one));
					
				}	
				else if(num2field.getText().equals("4")) {
					resultlabel.setText(gramToOunce(one));
					
				}else {
					JOptionPane.showMessageDialog(null, "Please enter a valid option", "Error", JOptionPane.INFORMATION_MESSAGE, null);
				}
				try {
					TimeUnit.MICROSECONDS.sleep(300);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				int result=JOptionPane.showConfirmDialog(null,"Would you like to exit the program?", "Calculator",
			               JOptionPane.YES_NO_OPTION,
			               JOptionPane.QUESTION_MESSAGE);
				if(result == JOptionPane.YES_OPTION){
		               dispose();
			}
				
				}
				
				if(choosesum.getSelectedItem().equals("Convert between number systems"))
					
				{
				
				if(num2field.getText().equals("1")) {
					resultlabel.setText(Conversion_Decimal_to_Hexadecimal(one));
				}else if(num2field.getText().equals("2")) {
					resultlabel.setText(Conversion_Hexadecimal_to_Decimal(one));
					
				}else if(num2field.getText().equals("3")) {
					//resultlabel.setText(dectobin(one));
					dectobin(one);
					
				}else if(num2field.getText().equals("4")) {
					resultlabel.setText(bintodec(one));
					
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Please enter a valid option", "Error", JOptionPane.INFORMATION_MESSAGE, null);
				}
				try {
					TimeUnit.MICROSECONDS.sleep(300);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				int result=JOptionPane.showConfirmDialog(null,"Would you like to exit the program?", "Calculator",
			               JOptionPane.YES_NO_OPTION,
			               JOptionPane.QUESTION_MESSAGE);
				if(result == JOptionPane.YES_OPTION){
		               dispose();
			}
				}
				
			
				
			}
		});
		btnsum.setBounds(305, 121, 89, 23);
		contentPane.add(btnsum);
		
		
	}

	public static String Add(String one, String two) {/// function returns string for adding two numbers.
		
		
		
		double num1 = Double.parseDouble(one);
		double num2 = Double.parseDouble(two);
		
		
		return String.valueOf("answer = "+(num1+num2));
		
		
		// TODO Auto-generated method stub
		
	}
	
	
	public static String Sub(String one, String two) {
		double num1 = Double.parseDouble(one);
		double num2 = Double.parseDouble(two);
		
		return String.valueOf("answer = "+(num1-num2));
		
		
	}
	
	
	public static String Divide(String one, String two){
		double num1 = Double.parseDouble(one);
		double num2 = Double.parseDouble(two);
		double answer=num1/num2;
		
		return String.valueOf(num1/num2);
		
	}
	
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

	public static String tofaren(String one) {

		double celcius=Double.parseDouble(one);
		double d= 1.8;
		double f;
		f=(celcius*d)+32;
	
		
		return String.valueOf(one+"°C = "+f+"°F");
	


		
	
	}


	public static String toCelcius(String one) {
		double c;
		double f=Double.parseDouble(one);

		c=(f-32)/1.8;

		return String.valueOf(one+"°F = "+c+"°C");
	}

	public static String multiply(String one, String two) {

		double first=Double.parseDouble(one);
		double second=Double.parseDouble(two);
	
	
		return String.valueOf(first*second);
	
	

	}


private static String inchToCm (String one) {
	
		double inches=Double.parseDouble(one);
		double cm = inches * 2.54;
	
	
		return String.valueOf(inches + " inch = " + cm + "cm");		
	} 

	private static String cmToInch (String one) {
	double cm=Double.parseDouble(one);	
	double inch = cm / 2.54;
		
		return String.valueOf(cm + "cm = " + inch + " inches");
	}

	private static String ounceToGram (String one) {
		double ounce=Double.parseDouble(one);
		double gram = ounce * 28.349523125;
		return String.valueOf(ounce + " ounces = " + gram + " grams");
	
	}

	private static String gramToOunce(String one) {
		double gram =Double.parseDouble(one);
		double ounce = gram / 28.349523125;
		return String.valueOf(gram + " grams = " + ounce + " ounces");
		
	}	
	
	public static String  Conversion_Decimal_to_Hexadecimal(String one)
	{
		
		
		boolean check= false;
		String inputstring= ""; // Taken user input as string and runs through the int checker then it should pass the string as integer if the string is false is would display the error message
		while (check== false)  // Taken user input as string checks it by using a while loop
		{
			
			
			inputstring=one;
			if (intchecker2(inputstring)== true) // In-reverse so takes input of user runs it through the function method down below called "int checker" 
			{
				check= true;
			}
			else 
			{
				return String.valueOf("Entered INVALID input!!");
				
			}
		}
		
		int DECTOHEX = Integer.parseInt(inputstring);// "parse int"-  try to convert to int if it can
		int Remainder;     // For storing remainder
		String Output="";   // For storing result
		
		while(DECTOHEX>0)
		{ // Digits in hexadecimal number system
			char HexaDecimal[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			Remainder=DECTOHEX%16; 
			Output=HexaDecimal[Remainder]+Output; 
			DECTOHEX=DECTOHEX/16;
		}
		
		
		
		return String.valueOf(Output);
	
	}
	public static boolean intchecker2(String one)    
	{
		String number = one;
		Boolean check2= false;
		try 
		{
		    Integer.parseInt(one); // Runs user input to see if string can be converted if not it returns false goes back to while loop and goes to the error message
			check2= true;
		}
		catch(NumberFormatException e) // Using format exception between to pass the String as a integer 
		{
			check2 = false;
		}
		return check2;
	}
	
	
	public static String Conversion_Hexadecimal_to_Decimal(String one)
	{   
		
		String Hexa=one;
		
		int Decimal=Integer.parseInt(Hexa,16);// Takes user input and passes through as Integer then runs it against the base 16 number system.
		Hexa = Hexa.toUpperCase();  //Puts the input as Upper case
		
		
		return String.valueOf(Decimal);
		
	}
	
	public static void dectobin(String one)
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
		
	
	public static String bintodec(String one)
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
}
