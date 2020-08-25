package mediumDayOfTheWeek;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[] args) {
		
		
//		  Day of the Week
//		  
//		  Problem:
//		  You receive a date and need to know what day of the week it is.
//		  
//		  Task:
//		  Create a program that takes in a string containing a date, and outputs
//		  the day of the week.
//		  
//		  Input Format:
//		  A string containing a date in either "MM/DD/YYYY" format or
//		  "Month Day, Year" format.
//		  
//		  Output Format:
//		  A string containing the day of the week from the provided date.
//		  
//		  Sample Input:
//		  11/19/2019
//		  
//		  Sample Output:
//		  Tuesday
		 
		
		System.out.println("Day of the Week\n" + 
				"\n" + 
				"Problem:\n" + 
				"You receive a date and need to know what day of the week it is.\n" + 
				"\n" + 
				"Task:\n" + 
				"Create a program that takes in a string containing a date, and outputs\n" + 
				"the day of the week.\n" + 
				"\n" + 
				"Input Format:\n" + 
				"A string containing a date in either \"MM/DD/YYYY\" format or\n" + 
				"\"Month Day, Year\" format.\n" + 
				"\n" + 
				"Output Format:\n" + 
				"A string containing the day of the week from the provided date.\n" + 
				"\n" + 
				"Sample Input:\n" + 
				"11/19/2019\n" + 
				"\n" + 
				"Sample Output:\n" + 
				"Tuesday\n" +
				"\n" +
				"****************************************************************************\n");
		
		System.out.println("Input date formated as above:");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MMMMM dd, yyyy");
		SimpleDateFormat day = new SimpleDateFormat("EEEEE");
		Date date = new Date();
		try 
		{
			date = sdf.parse(input);
		} catch (ParseException e) 
		{
			try 
			{
				date = sdf2.parse(input);
			} catch (ParseException e1) 
			{
				System.out.println("Date did not match either format specified");
			}
		}
		System.out.println("\nDay of the week:\n" + day.format(date));
		
	}

}
