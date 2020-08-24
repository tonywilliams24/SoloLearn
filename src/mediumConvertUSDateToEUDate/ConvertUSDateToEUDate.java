package mediumConvertUSDateToEUDate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConvertUSDateToEUDate 
{

	public static void main(String[] args) 
	{
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
		System.out.println(EU);
	}
	static String[] UStoEU(String[] date)
	{
		String tmp = date[1];
		date[1] = date[0];
		date[0] = tmp;
		return date;
	}

}
