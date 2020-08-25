package mediumSafetyDepositBoxes;

import java.util.Scanner;

public class SafetyDepositBoxes
{

	public static void main(String[] args)
	{
		
		
//		  Safety Deposit Boxes
//		  
//		  Problem:
//		  You are robbing a bank, but you’re not taking everything. You are looking for
//		  a specific item in the safety deposit boxes and you are going to drill into
//		  each one in order to find your item. Once you find your item you can make
//		  your escape, but how long will it take you to get to that item?
//		  
//		  Task:
//		  Determine the amount of time it will take you to find the item you are
//		  looking for if it takes you 5 minutes to drill into each box.
//		  
//		  Input Format:
//		  A string that represent the items in each box that will be drilled
//		  in order (items are separated by a comma), and secondly, a string of
//		  which item you are looking for.
//		  
//		  Output Format:
//		  An integer of the amount of time it will take for you to find your item.
//		  
//		  Sample Input:
//		  'gold,diamonds,documents,Declaration of Independence,keys'
//		  'Declaration of Independence'
//		  
//		  Sample Output:
//		  20
		 
		System.out.println("Safety Deposit Boxes\n" + 
				"\n" + 
				"Problem:\n" + 
				"You are robbing a bank, but you’re not taking everything. You are looking for\n" + 
				"a specific item in the safety deposit boxes and you are going to drill into\n" + 
				"each one in order to find your item. Once you find your item you can make\n" + 
				"your escape, but how long will it take you to get to that item?\n" + 
				"\n" + 
				"Task:\n" + 
				"Determine the amount of time it will take you to find the item you are\n" + 
				"looking for if it takes you 5 minutes to drill into each box.\n" + 
				"\n" + 
				"Input Format:\n" + 
				"A string that represent the items in each box that will be drilled\n" + 
				"in order (items are separated by a comma), and secondly, a string of\n" + 
				"which item you are looking for.\n" + 
				"\n" + 
				"Output Format:\n" + 
				"An integer of the amount of time it will take for you to find your item.\n" + 
				"\n" + 
				"Sample Input:\n" + 
				"'gold,diamonds,documents,Declaration of Independence,keys'\n" + 
				"'Declaration of Independence'\n" + 
				"\n" + 
				"Sample Output:\n" + 
				"20\n" +
				"\n" +
				"****************************************************************************\n");
		
		System.out.println("Please enter two strings as described above:");
		Scanner in = new Scanner(System.in);
		String items = in.nextLine();
		String find = in.nextLine();
		
		String itemsarr[] = items.split(",");
		for(int i=1; i<=itemsarr.length; i++)
		{
			if(itemsarr[i-1].equals(find))
			{
				System.out.println("\nTime to find item: " + i*5 + " Minutes");
			}
		}

	}

}
