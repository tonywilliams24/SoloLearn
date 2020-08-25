package mediumFlowingWords;

import java.util.Scanner;

public class FlowingWords
{

	public static void main(String[] args)
	{
		
		
//		  Flowing Words
//		  
//		  Problem:
//		  If a sentence flows, the first letter of each word will be the same to the
//		  last letter of the previous word.
//		  
//		  Task:
//		  Write a program that takes in a string that contains a sentence, checks
//		  if the first letter of each word is the same as the last letter of the
//		  previous word. If the condition is met, output true, if not, output false.
//		  Casing does not matter.
//		  
//		  Input Format:
//		  A string containing a sentence of words.
//		  
//		  Output Format:
//		  A string: true or false.
//		  
//		  Sample Input:
//		  this string gets stuck
//		  
//		  Sample Output:
//		  true
		 
		System.out.println("Flowing Words\n" + 
				"\n" + 
				"Problem:\n" + 
				"If a sentence flows, the first letter of each word will be the same to the\n" + 
				"last letter of the previous word.\n" + 
				"\n" + 
				"Task:\n" + 
				"Write a program that takes in a string that contains a sentence, checks\n" + 
				"if the first letter of each word is the same as the last letter of the\n" + 
				"previous word. If the condition is met, output true, if not, output false.\n" + 
				"Casing does not matter.\n" + 
				"\n" + 
				"Input Format:\n" + 
				"A string containing a sentence of words.\n" + 
				"\n" + 
				"Output Format:\n" + 
				"A string: true or false.\n" + 
				"\n" + 
				"Sample Input:\n" + 
				"this string gets stuck\n" + 
				"\n" + 
				"Sample Output:\n" + 
				"true\n" +
				"\n" +
				"****************************************************************************\n");
		
		System.out.println("Please enter a sentace of words");
		
		Scanner in = new Scanner(System.in);
		String sent = in.nextLine();
		sent = sent.trim().toLowerCase();
		boolean bool = true;
		for(int i=0; i<sent.length(); i++)
		{
			char c = sent.charAt(i);
			if(c == ' ')
			{
				if(sent.charAt(i-1) != sent.charAt(i+1))
				{
					bool = false;
				}
			}
		}
		System.out.println("\nResult:\n" + bool);

	}

}
