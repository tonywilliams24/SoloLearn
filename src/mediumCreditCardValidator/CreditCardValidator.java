package mediumCreditCardValidator;

import java.util.Scanner;

public class CreditCardValidator
{
	
	
//	  Credit Card Validator
//	  
//	  Problem:
//	  You need to verify if the given credit card number is valid. For that you
//	  need to use the Luhn test.
//	  
//	  Here is the Luhn formula:
//	  1. Reverse the number.
//	  2. Multiple every second digit by 2.
//	  3. Subtract 9 from all numbers higher than 9.
//	  4. Add all the digits together.
//	  5. Modulo 10 of that sum should be equal to 0.
//	  
//	  Task:
//	  Given a credit card number, validate that it is valid using the Luhn test.
//	  Also, all valid cards must have exactly 16 digits.
//	  
//	  Input Format:
//	  A string containing the credit card number you need to verify.
//	  
//	  Output Format:
//	  A string 'valid' in case the input is a valid credit card number (passes
//	  the Luhn test and is 16 digits long), or 'not valid', if it's not.
//	  
//	  Sample Input:
//	  4091131560563988
//	  
//	  Sample Output:
//	  valid
	 
	
	
	
	public static void main(String[] args)
	{
		
		System.out.println("Credit Card Validator\n" + 
				"\n" + 
				"Problem:\n" + 
				"You need to verify if the given credit card number is valid. For that you\n" + 
				"need to use the Luhn test.\n" + 
				"\n" + 
				"Here is the Luhn formula:\n" + 
				"1. Reverse the number.\n" + 
				"2. Multiple every second digit by 2.\n" + 
				"3. Subtract 9 from all numbers higher than 9.\n" + 
				"4. Add all the digits together.\n" + 
				"5. Modulo 10 of that sum should be equal to 0.\n" + 
				"\n" + 
				"Task:\n" + 
				"Given a credit card number, validate that it is valid using the Luhn test.\n" + 
				"Also, all valid cards must have exactly 16 digits.\n" + 
				"\n" + 
				"Input Format:\n" + 
				"A string containing the credit card number you need to verify.\n" + 
				"\n" + 
				"Output Format:\n" + 
				"A string 'valid' in case the input is a valid credit card number (passes\n" + 
				"the Luhn test and is 16 digits long), or 'not valid', if it's not.\n" + 
				"\n" + 
				"Sample Input:\n" + 
				"4091131560563988\n" + 
				"\n" + 
				"Sample Output:\n" + 
				"valid\n" + 
				"\n" +
				"****************************************************************************\n");
		
		System.out.println("Input Credit Card Number:");
		
		Scanner in = new Scanner(System.in);
		String numstr = in.nextLine();
		Boolean bool = true;
		String numarr[] = new String[16]; 
	
		
		if(numstr.length() != 16) bool = false;
		
		if(bool)
		{
			numarr = numstr.split("");
			int tmp;
			int sum=0;
			for(int i=15; i>=0; i--)
			{
				tmp = Integer.valueOf(numarr[i]);
				if(i%2 == 0) tmp*=2;
				if(tmp > 9) tmp-=9;
				sum+=tmp;
			}
			if(sum%10 != 0) bool = false;
		}
		System.out.println("\nResult: ");
		if(bool) System.out.println("valid");
		else System.out.println("not valid");		
	}
}
