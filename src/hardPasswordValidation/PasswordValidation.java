package hardPasswordValidation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidation
{

	public static void main(String[] args)
	{
		
		
		
//		  Password Validation
//		  
//		  Problem:
//		  You're interviewing to join a security team. They want to see you build a
//		  password evaluator for your technical interview to validate the input.
//		  
//		  Task:
//		  Write a program that takes in a string as input and evaluates it as a valid 
//		  password. The password is valid if it has at a minimum 2 numbers, 2 of the 
//		  following special characters ('!', '@', '#', '$', '%', '&', '*'), and a
//		  length of at least 7 characters. If the password passes the check, output
//		  'Strong', else output 'Weak'.
//		  
//		  Input Format:
//		  A string representing the password to evaluate.
//		  
//		  Output Format:
//		  A string that says 'Strong' if the input meets the
//		  requirements, or 'Weak', if not.
//		  
//		  Sample Input:
//		  Hello@$World19
//		  
//		  Sample Output:
//		  Strong
		 
		 
		
		System.out.println("Password Validation\n" + 
				"\n" + 
				"Problem:\n" + 
				"You're interviewing to join a security team. They want to see you build a\n" + 
				"password evaluator for your technical interview to validate the input.\n" + 
				"\n" + 
				"Task:\n" + 
				"Write a program that takes in a string as input and evaluates it as a valid \n" + 
				"password. The password is valid if it has at a minimum 2 numbers, 2 of the \n" + 
				"following special characters ('!', '@', '#', '$', '%', '&', '*'), and a\n" + 
				"length of at least 7 characters. If the password passes the check, output\n" + 
				"'Strong', else output 'Weak'.\n" + 
				"\n" + 
				"Input Format:\n" + 
				"A string representing the password to evaluate.\n" + 
				"\n" + 
				"Output Format:\n" + 
				"A string that says 'Strong' if the input meets the\n" + 
				"requirements, or 'Weak', if not.\n" + 
				"\n" + 
				"Sample Input:\n" + 
				"Hello@$World19\n" + 
				"\n" + 
				"Sample Output:\n" + 
				"Strong\n" +
				"\n" + 
				"****************************************************************************\n");
		
		System.out.print("Enter Password: ");
		Scanner in = new Scanner(System.in);
		String pw = in.nextLine();
		int num=0;
		int spec=0;
		Pattern specChars = Pattern.compile("[!@#\\$%&\\*]");
		boolean bool = false;
		
		if(pw.length()>=7)
		{
			for(int i=0; i<pw.length(); i++)
			{
				
				char c = pw.charAt(i);
				if(Character.isDigit(c)) num++;
				if(specChars.matcher(String.valueOf(c)).find()) spec++;
if(num >= 2 && spec >= 2) {bool = true; break;}
			}
		}
		if(bool) System.out.println("\nPassword Strength: Strong");
		else 
		System.out.println("\nPassword Strength: Weak ");

	}

}
