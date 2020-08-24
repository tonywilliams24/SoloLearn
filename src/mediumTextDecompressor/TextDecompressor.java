package mediumTextDecompressor;

import java.util.Scanner;

public class TextDecompressor
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String comp = in.nextLine();
		StringBuilder sb = new StringBuilder(comp.charAt(0));
		for(int i = 1; i<comp.length(); i+=2)
		{
			int tmp = Integer.valueOf(Character.toString((comp.charAt(i))));
			while(tmp>0) 
			{
				sb.append(comp.charAt(i-1));
				tmp--;
			}

		}
		System.out.println(sb.toString());

	}

}
