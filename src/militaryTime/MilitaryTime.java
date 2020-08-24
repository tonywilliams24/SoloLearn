package militaryTime;

import java.util.Scanner;

public class MilitaryTime {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String inTime = in.nextLine();
		String[] inArr = inTime.split("[:\\s]");
		if(check12(inArr))
		{
			if(checkAM(inArr))
			{
				convert12AM(inArr);
			}
		}
		else if(checkAM(inArr))
		{
			convertAM(inArr);
		}
		else
		{
			convertPM(inArr);
		}
		printTime(inArr);
	}
		static boolean checkAM(String[] arr)
		{
			boolean bool;
			if(arr[2].toLowerCase().contains("a")){return bool = true;}
			else {return bool = false;}
		}
		static boolean check12(String[] arr)
		{
			boolean bool;
			if(arr[0].equals("12")){return bool = true;}
			else {return bool = false;}
		}
		static void convertPM(String[] arr)
		{
			int tmpH = Integer.valueOf(arr[0]);
			tmpH = tmpH + 12;
			arr[0] = String.valueOf(tmpH);
		}
		static void convertAM(String[] arr)
		{
			int tmpH = Integer.valueOf(arr[0]);
			if(tmpH < 10){arr[0] = "0" + String.valueOf(tmpH);}
			else {arr[0] = String.valueOf(tmpH);}
			
		}
		static void convert12AM(String[] arr)
		{
			int tmpH = Integer.valueOf(arr[0]);
			tmpH = tmpH - 12;
			arr[0] = String.valueOf(tmpH) + "0";
		}
		static void printTime(String[] arr)
		{
			System.out.println(arr[0] + ":"+arr[1]);
		}

}
