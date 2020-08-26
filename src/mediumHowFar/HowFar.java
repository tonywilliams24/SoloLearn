package mediumHowFar;

import java.util.Scanner;

public class HowFar 
{

	public static void main(String[] args) 
	{
		
		
//		  How Far?
//		  
//		  Problem:
//		  You are walking from your house to a pond that is down your street. How many
//		  blocks over will you have to walk until you get to the pond?
//		  
//		  Task:
//		  Evaluate how many blocks you will have to walk if you are given a
//		  representation of your street where H represents your house, P represents 
//		  the pond, and every B represents a block in between the two.
//		  
//		  Input Format:
//		  A string of letters representing your house, the pond, and blocks on
//		  your street.
//		  
//		  Output Format:
//		  An integer value that represents the number of blocks between your house
//		  and the pond.
//		  
//		  Sample Input:
//		  BBHBBBBPBBB
//		  
//		  Sample Output:
//		  4￼
		 
		System.out.println("How Far?\n" + 
				"\n" + 
				"Problem:\n" + 
				"You are walking from your house to a pond that is down your street. How many\n" + 
				"blocks over will you have to walk until you get to the pond?\n" + 
				"\n" + 
				"Task:\n" + 
				"Evaluate how many blocks you will have to walk if you are given a\n" + 
				"representation of your street where H represents your house, P represents \n" + 
				"the pond, and every B represents a block in between the two.\n" + 
				"\n" + 
				"Input Format:\n" + 
				"A string of letters representing your house, the pond, and blocks on\n" + 
				"your street.\n" + 
				"\n" + 
				"Output Format:\n" + 
				"An integer value that represents the number of blocks between your house\n" + 
				"and the pond.\n" + 
				"\n" + 
				"Sample Input:\n" + 
				"BBHBBBBPBBB\n" + 
				"\n" + 
				"Sample Output:\n" + 
				"4￼\n" + 
				"\n" +
				"****************************************************************************\n");
		
		System.out.println("Input string as formated above:");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int H = input.indexOf('H');
		int P = input.indexOf('P');
		int B = Math.abs(P-H)-1;
		System.out.println("\nNumber of blocks:\n" + B);

	}

}
