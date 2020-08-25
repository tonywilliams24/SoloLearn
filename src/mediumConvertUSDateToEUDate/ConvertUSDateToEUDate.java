package mediumConvertUSDateToEUDate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConvertUSDateToEUDate 
{

	public static void main(String[] args) 
	{
		
		
//		  Convert US date to EU date
//		  
//		  Problem:
//		  You and your friends are going to Europe! You have made plans to travel
//		  around Europe with your friends, but one thing you need to take into account
//		  so that everything goes according to play, is that the format of their date
//		  is different than from what is used in the United States. Your job is to
//		  convert all your dates from MM/DD/YYYY to DD/MM/YYYY.
//		  
//		  Task:
//		  Create a function that takes in a string containing a date that is in
//		  US format, and return a string of the same date converted to EU.
//		  
//		  Input Format:
//		  A string that contains a date formatting 11/19/2019 or November 19, 2019.
//		  
//		  Output Format:
//		  A string of the same date but in a different format: 19/11/2019.
//		  
//		  Sample Input:
//		  7/26/2019
//		  
//		  Sample Output:
//		  26/7/2019
		 
		
		
		System.out.println("Convert US date to EU date\n" + 
				"\n" + 
				"Problem:\n" + 
				"You and your friends are going to Europe! You have made plans to travel\n" + 
				"around Europe with your friends, but one thing you need to take into account\n" + 
				"so that everything goes according to play, is that the format of their date\n" + 
				"is different than from what is used in the United States. Your job is to\n" + 
				"convert all your dates from MM/DD/YYYY to DD/MM/YYYY.\n" + 
				"\n" + 
				"Task:\n" + 
				"Create a function that takes in a string containing a date that is in\n" + 
				"US format, and return a string of the same date converted to EU.\n" + 
				"\n" + 
				"Input Format:\n" + 
				"A string that contains a date formatting 11/19/2019 or November 19, 2019.\n" + 
				"\n" + 
				"Output Format:\n" + 
				"A string of the same date but in a different format: 19/11/2019.\n" + 
				"\n" + 
				"Sample Input:\n" + 
				"7/26/2019\n" + 
				"\n" + 
				"Sample Output:\n" + 
				"26/7/2019\n" + 
				"\n" +
				"****************************************************************************\n");
		
		System.out.println("Input date formatted as shown above:");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] arr = str.split("[\\s,./]+");
		Map<String, String> months = new HashMap<String, String>();
		months.put("January", "1");
		months.put("February", "2");
		months.put("March", "3");
		months.put("April", "4");
		months.put("May", "5");
		months.put("June", "6");
		months.put("July", "7");
		months.put("August", "8");
		months.put("September", "9");
		months.put("October", "10");
		months.put("November", "11");
		months.put("December", "12");		
		if(arr[0].length() > 2)
		{
			arr[0] = months.get(arr[0]);
			UStoEU(arr);
		}
		else
		{
			UStoEU(arr);
		}
		String EU = String.join("/", arr);
		System.out.println("\nEU Date:\n" + EU);
	}
	static String[] UStoEU(String[] date)
	{
		String tmp = date[1];
		date[1] = date[0];
		date[0] = tmp;
		return date;
	}

}
