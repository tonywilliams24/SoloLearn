package mediumCMYKtoRGB;

import java.util.Scanner;

public class CMYKtoRGB
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String cs = in.nextLine();
		String ms = in.nextLine();
		String ys = in.nextLine();
		String ks = in.nextLine();
		
		double cd = Double.valueOf(cs);
		double md = Double.valueOf(ms);
		double yd = Double.valueOf(ys);
		double kd = Double.valueOf(ks);
		
		double RD = Math.round(255 * (1-cd) * (1-kd));
		double GD = Math.round(255 * (1-md) * (1-kd));
		double BD = Math.round(255 * (1-yd) * (1-kd));
		
		System.out.println((int)RD + "," + (int)GD + "," +(int)BD);

	}

}
