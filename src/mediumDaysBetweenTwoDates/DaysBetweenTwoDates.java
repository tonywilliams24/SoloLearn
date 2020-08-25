//package mediumDaysBetweenTwoDates;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.time.temporal.ChronoUnit;
//import java.util.Scanner;
//
//public class DaysBetweenTwoDates
//{
//
//	public static void main(String[] args)
//	{
//		Scanner in = new Scanner(System.in);
//		String oldstr = in.nextLine();
//		String newstr = in.nextLine();
//		in.close();
//		DateTimeFormatter form = DateTimeFormatter.ofPattern("MMMM dd, uuuu");
//		LocalDate olddate = LocalDate.parse(oldstr, form);
//		LocalDate newdate = LocalDate.parse(newstr, form);
//		long days =  ChronoUnit.DAYS.between(olddate, newdate);
//		System.out.println(Math.abs(days));
//	}
//
//}