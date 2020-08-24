package mediumNewDriversLicense;

import java.util.Arrays;
import java.util.Scanner;

public class NewDriversLicense
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String me = in.nextLine();
		int agents = in.nextInt();
		in.nextLine();
		String others = in.nextLine();
		String othersarr[] = others.split(" ");
		String people[] = Arrays.copyOf(othersarr, 5);
		people[4] = me;
		int pos=4;

		for(int i=4; i>0; i--)
		{
			for(int j=0; j<i; j++ )
			if(people[j].toLowerCase().compareTo(people[j+1].toLowerCase()) > 0)
			{
				String tmp = people[j];
				people[j] = people[j+1]; 
				people[j+1] = tmp;
				if(people[j].compareTo(me) == 0) pos=j;
			}
		}
		int time = (pos / agents) * 20 + 20; 
		System.out.println(time);
		
	}

}
