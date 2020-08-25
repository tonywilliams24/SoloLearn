package mediumAverageWordLength;

import java.util.Scanner;

public class AverageWordLength
{

	public static void main(String[] args)
	{
		
		
//		  Average Word Length
//		  
//		  Problem
//		  You are in a college level English class, your professor wants you to write
//		  an essay, but you need to find out the average length of all the words you
//		  use. It is up to you to figure out how long each word is and to average it
//		  out.
//		  
//		  Task:
//		  Takes in a string, figure out the average length of all the words and
//		  return a number representing the average length. Remove all punctuation.
//		  Round up to the nearest whole number.
//		  
//		  Input Format:
//		  A string containing multiple words.
//		  
//		  Output Format:
//		  A number representing the average length of each word, rounded
//		  up to the nearest whole number.
//		  
//		  Sample Input:
//		  this phrase has multiple words
//		  
//		  Sample Output:
//		  6
		 
		
		System.out.println("Average Word Length\n" + 
				"\n" + 
				"Problem\n" + 
				"You are in a college level English class, your professor wants you to write\n" + 
				"an essay, but you need to find out the average length of all the words you\n" + 
				"use. It is up to you to figure out how long each word is and to average it\n" + 
				"out.\n" + 
				"\n" + 
				"Task:\n" + 
				"Takes in a string, figure out the average length of all the words and\n" + 
				"return a number representing the average length. Remove all punctuation.\n" + 
				"Round up to the nearest whole number.\n" + 
				"\n" + 
				"Input Format:\n" + 
				"A string containing multiple words.\n" + 
				"\n" + 
				"Output Format:\n" + 
				"A number representing the average length of each word, rounded\n" + 
				"up to the nearest whole number.\n" + 
				"\n" + 
				"Sample Input:\n" + 
				"this phrase has multiple words\n" + 
				"\n" + 
				"Sample Output:\n" + 
				"6\n" +
				"\n" +
				"****************************************************************************\n");
		
		System.out.println("Input phrase of multiple words:");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int S = 1;
		int L = 0;
		int A;
		for(int i=0; i<str.length(); i++)
		{
			char C = str.charAt(i);
			if(Character.isLetter(C))
			{
				L++;
			}
			else if(C == ' ')
			{
				S++;
			}
		}
		A = (L+S-1)/S;
		System.out.println("\nAverage word length: " + A);
	}

}
