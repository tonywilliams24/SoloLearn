package recursionMediumMissingNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class MissingNumbers
{

	public static void main(String[] args)
	{
		
		
		
//		  Missing Numbers
//		  
//		  Problem:
//		  You are given a list of whole numbers in ascending order. You need to find
//		  which numbers are missing in the sequence.
//		  
//		  Task:
//		  Create a program that takes in a list of numbers and outputs the missing
//		  numbers in the sequence separated by spaces.
//		  
//		  Input Format:
//		  The first input denotes the length of the list (N). The next N lines
//		  contain the list elements as integers.
//		  
//		  Output Format:
//		  A string containing a space-separated list of the missing numbers.
//		  
//		  Sample Input:
//		  5
//		  2
//		  4
//		  5
//		  7
//		  8
//		  
//		  Sample Output:
//		  3 6
		 
		System.out.println("Missing Numbers\n" + 
				"\n" + 
				"Problem:\n" + 
				"You are given a list of whole numbers in ascending order. You need to find\n" + 
				"which numbers are missing in the sequence.\n" + 
				"\n" + 
				"Task:\n" + 
				"Create a program that takes in a list of numbers and outputs the missing\n" + 
				"numbers in the sequence separated by spaces.\n" + 
				"\n" + 
				"Input Format:\n" + 
				"The first input denotes the length of the list (N). The next N lines\n" + 
				"contain the list elements as integers.\n" + 
				"\n" + 
				"Output Format:\n" + 
				"A string containing a space-separated list of the missing numbers.\n" + 
				"\n" + 
				"Sample Input:\n" + 
				"5\n" + 
				"2\n" + 
				"4\n" + 
				"5\n" + 
				"7\n" + 
				"8\n" + 
				"\n" + 
				"Sample Output:\n" + 
				"3 6\n" +
				"\n" +
				"****************************************************************************\n");
		
		System.out.println("Please input as described above:");
		
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		int arr[] = new int[len];
		ArrayList<Integer> nums = new ArrayList<>();
		arr[0] = in.nextInt();
		for(int i = 1; i<len; i++)
		{
			arr[i] = in.nextInt();
			if(arr[i]-arr[i-1]!=1)
			{
			nums = missing(arr[i],arr[i-1], nums);
			}
		}
		System.out.println("\nMissing Numbers:\n" + nums.toString().replaceAll("\\[","").replaceAll("\\]", "").replaceAll(",", ""));
	}
	static ArrayList<Integer> missing(int max, int min, ArrayList<Integer> list)
	{
		if(max - min != 1)
		{
			min++;
			list.add(min);
			missing(max, min, list);
		}
		return list;
	}

}
