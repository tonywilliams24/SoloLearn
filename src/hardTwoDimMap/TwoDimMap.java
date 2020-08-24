package hardTwoDimMap;


import java.util.Arrays;
import java.util.Scanner;

public class TwoDimMap
{

	public static void main(String[] args)
	{
		
		
//		  2D Map
//		  
//		  Problem
//		  You're given a representation of a 5x5 2D map, and if you can only move left,
//		  right, up, or down, determine how many moves you would have to make to get
//		  between two points on the map.
//		  
//		  Task:
//		  Determine the total number of moves that are needed between two points on
//		  a map. The points that you move between are marked with a P and the spaces
//		  in between are marked with X.
//		  
//		  Input Format:
//		  A string that represents the 2D space starting at the top left.
//		  Each level from top to bottom is separated by a comma.
//		  
//		  Output Format:
//		  An integer that represents the total number of moves that you
//		  had to make.
//		  
//		  Sample Input:
//		  XPXXX,XXXXX,XXXXX,XXXPX,XXXXX
//		  
//		  Sample Output:
//		  5
		 
		
		System.out.println("2D Map\n" + 
				"\n" + 
				"Problem:\n" + 
				"You're given a representation of a 5x5 2D map, and if you can only move left,\n" + 
				"right, up, or down, determine how many moves you would have to make to get\n" + 
				"between two points on the map.\n" + 
				"\n" + 
				"Task:\n" + 
				"Determine the total number of moves that are needed between two points on\n" + 
				"a map. The points that you move between are marked with a P and the spaces\n" + 
				"in between are marked with X.\n" + 
				"\n" + 
				"Input Format:\n" + 
				"A string that represents the 2D space starting at the top left.\n" + 
				"Each level from top to bottom is separated by a comma.\n" + 
				"\n" + 
				"Output Format:\n" + 
				"An integer that represents the total number of moves that you\n" + 
				"had to make.\n" + 
				"\n" + 
				"Sample Input:\n" + 
				"XPXXX,XXXXX,XXXXX,XXXPX,XXXXX\n" + 
				"\n" + 
				"Sample Output:\n" + 
				"5\n" +
				"\n" + 
				"*******************************************************************************\n");
		
		System.out.println("Please enter a string matching the format above: ");
		Scanner in = new Scanner(System.in);
		String mapStr = in.nextLine().replaceAll(",", "");
		char mapArr[][] = new char[5][5];
		int k = 0;
		int x[] = new int[2];
		int y[] = new int[2];
		int c = 0;
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(mapStr.charAt(k) == 'P')
				{
					x[c] = j;
					y[c] = i;
					c++;
				}
				mapArr[i][j]=mapStr.charAt(k);
				k++;
			}
		}
		int m = (Math.abs(x[1] - x[0])) + Math.abs((y[1] - y[0]));
		System.out.println("\nTotal Moves:\n" + m);
	}
}
