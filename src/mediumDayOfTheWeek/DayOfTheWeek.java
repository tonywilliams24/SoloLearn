package mediumDayOfTheWeek;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[] args) {
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
		System.out.println(day.format(date));
		
	}

}
