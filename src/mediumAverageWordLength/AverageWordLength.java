package mediumAverageWordLength;

import java.util.Scanner;

public class AverageWordLength {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int S = 1;
		int L = 0;
		int A;
		for(int i=0; i<str.length(); i++)
		{
			char C = str.charAt(i);
			if(Character.isLetter(C))
			{
				L++;
			}
			else if(C == ' ')
			{
				S++;
			}
		}
		A = (L+S-1)/S;
		System.out.println(A);
	}

}
