package mediumSnowballingNumbers;

import java.util.Scanner;

public class SnowballingNumbers
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		int nums[] = new int[len];
		int sum = 0;
		boolean bool = true;
		for(int i=0; i<len; i++)
		{
			nums[i] = in.nextInt();
			if(bool & nums[i]>sum)
			{
				sum += nums[i];
			}
			else
			{
				bool = false;
			}
			
		}
		in.close();
		System.out.println(bool);

	}

}
