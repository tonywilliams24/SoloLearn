package mediumHowFar;

import java.util.Scanner;

public class HowFar 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int H = input.indexOf('H');
		int P = input.indexOf('P');
		int B = Math.abs(P-H)-1;
		System.out.println(B);

	}

}
