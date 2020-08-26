package mediumInitials;

import java.util.Scanner;

public class Initials
{

	public static void main(String[] args)
	{
		
		
		
//		  Initials
//		  
//		  Problem:
//		  You are given a list of names for a fundraiser, but you need to keep the
//		  names relatively anonymous. You are tasked with getting the initials for each
//		  name provided.
//		  
//		  Task:
//		  Given a list of first and last names, take the first letter from each
//		  name to create initials and output them as a space-separated string.
//		  
//		  Input Format:
//		  The first input denotes the number of names in the list (N). The next
//		  N lines contain the list elements as strings.
//		  
//		  Output Format:
//		  A string containing the initials of each name in the original list,
//		  separated by spaces.
//		  
//		  Sample Input:
//		  3
//		  Nick Dunburry
//		  Tommy Newborne
//		  David James
//		  
//		  Sample Output:
//		  ND TN DJ
		 
		System.out.println("Initials\n" + 
				"\n" + 
				"Problem:\n" + 
				"You are given a list of names for a fundraiser, but you need to keep the\n" + 
				"names relatively anonymous. You are tasked with getting the initials for each\n" + 
				"name provided.\n" + 
				"\n" + 
				"Task:\n" + 
				"Given a list of first and last names, take the first letter from each\n" + 
				"name to create initials and output them as a space-separated string.\n" + 
				"\n" + 
				"Input Format:\n" + 
				"The first input denotes the number of names in the list (N). The next\n" + 
				"N lines contain the list elements as strings.\n" + 
				"\n" + 
				"Output Format:\n" + 
				"A string containing the initials of each name in the original list,\n" + 
				"separated by spaces.\n" + 
				"\n" + 
				"Sample Input:\n" + 
				"3\n" + 
				"Nick Dunburry\n" + 
				"Tommy Newborne\n" + 
				"David James\n" + 
				"\n" + 
				"Sample Output:\n" + 
				"ND TN DJ\n" + 
				"\n" +
				"****************************************************************************\n");
		
		System.out.println("Please input as described above:");
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		in.nextLine();
		String names[] = new String[size];
		String tmp[] = new String[2];
		for (int i=0; i<size; i++) names[i] = in.nextLine();
		System.out.println("\nInitials:");
		for (int i=0; i<size; i++)
		{
			tmp = names[i].split(" ");
			System.out.print(tmp[0].charAt(0));
			System.out.print(tmp[1].charAt(0));
			if(i!=size-1) System.out.print(" ");
		}

	}

}
