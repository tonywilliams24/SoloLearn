package mediumInitials;

import java.util.Scanner;

public class Initials
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		in.nextLine();
		String names[] = new String[size];
		String tmp[] = new String[2];
		for (int i=0; i<size; i++)
		{
			names[i] = in.nextLine();
			tmp = names[i].split(" ");
			System.out.print(tmp[0].charAt(0));
			System.out.print(tmp[1].charAt(0));
			if(i!=size-1) System.out.print(" ");
		}

	}

}
