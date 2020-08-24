package mediumCreditCardValidator;

import java.util.Scanner;

public class CreditCardValidator
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String numstr = in.nextLine();
		Boolean bool = true;
		String numarr[] = new String[16]; 
	
		
		if(numstr.length() != 16) bool = false;
		
		if(bool)
		{
			numarr = numstr.split("");
			int tmp;
			int sum=0;
			for(int i=15; i>=0; i--)
			{
				tmp = Integer.valueOf(numarr[i]);
				if(i%2 == 0) tmp*=2;
				if(tmp > 9) tmp-=9;
				sum+=tmp;
			}
			if(sum%10 != 0) bool = false;
		}
		if(bool) System.out.println("valid");
		else System.out.println("not valid");		
	}
}
