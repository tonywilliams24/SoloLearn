package multiples;

import java.util.Scanner;

public class multiples 
{

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		int three = (input-1)/3;
		int sum = 0;
		
		if(input>3)
		{
			for(int i=1; i<=three;i++)
			{
				sum += i*3;
			}
		}
		
		if(input>5)
		{
			int five = (input-1)/5;
			for(int j=1; j<=five;j++)
			{
				sum += j*5;
			}
		}

		if(input>15)
		{
			int fif = (input-1)/15;
			for(int k=1; k<=fif;k++)
			{
				sum -= k*15;
			}
		}
		System.out.println(sum);
	}

}
