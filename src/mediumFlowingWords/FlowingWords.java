package mediumFlowingWords;

import java.util.Scanner;

public class FlowingWords
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String sent = in.nextLine();
		sent = sent.trim().toLowerCase();
		boolean bool = true;
		for(int i=0; i<sent.length(); i++)
		{
			char c = sent.charAt(i);
			if(c == ' ')
			{
				if(sent.charAt(i-1) != sent.charAt(i+1))
				{
					bool = false;
				}
			}
		}
		System.out.println(bool);

	}

}
