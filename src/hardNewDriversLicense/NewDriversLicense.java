package hardNewDriversLicense;

import java.util.Arrays;
import java.util.Scanner;

public class NewDriversLicense
{

	public static void main(String[] args)
	{
		
		
//		  New Driver's License
//		  
//		  Problem: 
//		  You have to get a new driver's license and you show up at the office at the
//		  same time as 4 other people. The office says that they will see everyone in
//		  alphabetical order and it takes 20 minutes for them to process each new
//		  license. All of the agents are available now, and they can each see one
//		  customer at a time. How long will it take for you to walk out of the office
//		  with your new license?
//		  
//		  Task: 
//		  Given everyone's name that showed up at the same time, determine how long
//		  it will take to get your new license.
//		  
//		  Input Format:
//		  Your input will be a string of your name, then an integer of the number
//		  of available agents, and lastly a string of the other four names
//		  separated by spaces.
//		  
//		  Output Format:
//		  You will output an integer of the number of minutes that it will take
//		  to get your license.
//		  
//		  Sample Input
//		  'Eric'
//		  2
//		  'Adam Caroline Rebecca Frank'
//		  
//		  Sample Output
//		  40
		 

		
		System.out.println("New Driver's License\n" + 
				"\n" + 
				"Problem: \n" + 
				"You have to get a new driver's license and you show up at the office at the\n" + 
				"same time as 4 other people. The office says that they will see everyone in\n" + 
				"alphabetical order and it takes 20 minutes for them to process each new\n" + 
				"license. All of the agents are available now, and they can each see one\n" + 
				"customer at a time. How long will it take for you to walk out of the office\n" + 
				"with your new license?\n" + 
				"\n" + 
				"Task: \n" + 
				"Given everyone's name that showed up at the same time, determine how long\n" + 
				"it will take to get your new license.\n" + 
				"\n" + 
				"Input Format:\n" + 
				"Your input will be a string of your name, then an integer of the number\n" + 
				"of available agents, and lastly a string of the other four names\n" + 
				"separated by spaces.\n" + 
				"\n" + 
				"Output Format:\n" + 
				"You will output an integer of the number of minutes that it will take\n" + 
				"to get your license.\n" + 
				"\n" + 
				"Sample Input\n" + 
				"'Eric'\n" + 
				"2\n" + 
				"'Adam Caroline Rebecca Frank'\n" + 
				"\n" + 
				"Sample Output\n" + 
				"40" +
				"\n" + 
				"****************************************************************************\n");
		
		System.out.println("Please input as shown above:");
		Scanner in = new Scanner(System.in);
		String me = in.nextLine();
		int agents = in.nextInt();
		in.nextLine();
		String others = in.nextLine();
		String othersarr[] = others.split(" ");
		String people[] = Arrays.copyOf(othersarr, 5);
		people[4] = me;
		int pos=4;

		for(int i=4; i>0; i--)
		{
			for(int j=0; j<i; j++ )
			if(people[j].toLowerCase().compareTo(people[j+1].toLowerCase()) > 0)
			{
				String tmp = people[j];
				people[j] = people[j+1]; 
				people[j+1] = tmp;
				if(people[j].compareTo(me) == 0) pos=j;
			}
		}
		int time = (pos / agents) * 20 + 20; 
		System.out.println("\nTime to get license:\n" + time + " Minutes");
		
	}

}
