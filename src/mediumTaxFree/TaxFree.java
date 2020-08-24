package mediumTaxFree;

import java.util.Scanner;

public class TaxFree 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String numStr = in.nextLine();
		String[] numArr = numStr.split(",");
		double sum = 0;
		
		for(String i : numArr)
		{
			if(Double.valueOf(i)<20){sum += Double.valueOf(i) * 1.07;}
			else{sum += Double.valueOf(i);}
		}
		sum = Math.round(sum * 100.0) / 100.0;
		System.out.println(sum);
	}
}
