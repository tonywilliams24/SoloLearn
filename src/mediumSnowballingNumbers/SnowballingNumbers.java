package mediumSnowballingNumbers;

import java.util.Scanner;

public class SnowballingNumbers
{

	public static void main(String[] args)
	{
		
		
		
//		  Snowballing Numbers
//		  
//		  Problem:
//		  You are given a list of numbers in a particular order. You need to check to
//		  see if each number is greater than the sum of all the previous number of the
//		  list. If they are, you have created successful snowball numbers.
//		  
//		  Task:
//		  Create a program that takes in an array of numbers, check if each number is
//		  greater than the sum of all previous numbers, and output true if the condition
//		  is met, and false, if not.
//		  
//		  Input Format:
//		  The first input denotes the length of the list (N). The next N lines contain
//		  the list elements as integers.
//		  
//		  Output Format:
//		  A string, true or false.
//		  
//		  Sample Input:
//		  4
//		  1
//		  3
//		  7
//		  58
//		  
//		  Sample Output:
//		  true
		 
		
		System.out.println("Snowballing Numbers\n" + 
				"\n" + 
				"Problem:\n" + 
				"You are given a list of numbers in a particular order. You need to check to\n" + 
				"see if each number is greater than the sum of all the previous number of the\n" + 
				"list. If they are, you have created successful snowball numbers.\n" + 
				"\n" + 
				"Task:\n" + 
				"Create a program that takes in an array of numbers, check if each number is\n" + 
				"greater than the sum of all previous numbers, and output true if the condition\n" + 
				"is met, and false, if not.\n" + 
				"\n" + 
				"Input Format:\n" + 
				"The first input denotes the length of the list (N). The next N lines contain\n" + 
				"the list elements as integers.\n" + 
				"\n" + 
				"Output Format:\n" + 
				"A string, true or false.\n" + 
				"\n" + 
				"Sample Input:\n" + 
				"4\n" + 
				"1\n" + 
				"3\n" + 
				"7\n" + 
				"58\n" + 
				"\n" + 
				"Sample Output:\n" + 
				"true\n" + "\n" +
				"****************************************************************************\n");
		
		System.out.println("Please input as described above:");
		
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		int nums[] = new int[len];
		int sum = 0;
		boolean bool = true;
		for(int i=0; i<len; i++)
		{
			nums[i] = in.nextInt();
			if(bool & nums[i]>sum)
			{
				sum += nums[i];
			}
			else
			{
				bool = false;
			}
			
		}
		in.close();
		System.out.println("Snowballing Numbers?:\n" + bool);

	}

}
