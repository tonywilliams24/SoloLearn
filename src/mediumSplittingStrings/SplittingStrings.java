package mediumSplittingStrings;

import java.util.Scanner;

public class SplittingStrings
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int size = in.nextInt();
		StringBuilder sb = new StringBuilder(Character.toString(str.charAt(0)));
		for(int i = 1; i<str.length(); i++)
		{
			char c = str.charAt(i);
			if(i%size != 0)
			{
				
				sb.append(c);
			}
			else
			{
				sb.append("-"+c);
			}
			
		}
		System.out.println(sb.toString());

	}

}
