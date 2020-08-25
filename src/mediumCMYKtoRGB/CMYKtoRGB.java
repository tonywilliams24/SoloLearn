package mediumCMYKtoRGB;

import java.util.Scanner;

public class CMYKtoRGB
{

	public static void main(String[] args)
	{
		
		
		
//		  CMYK to RGB
//		  
//		  Problem:
//		  The CMYK color model is the standard in the printing industry and refers to
//		  the primary colors of pigment: Cyan, Magenta, Yellow, and Black. K stands for
//		  'Key' since in 4-color printing the Cyan, Magenta and Yellow printing plates
//		  are carefully keyed or aligned with the key of the Black key plate. RGB (Red,
//		  Green and Blue) is the color space for digital images.￼
//		  
//		  Task:
//		  Given a color in CMYK format, output the corresponding RGB color.
//		  
//		  Input Format:
//		  4 decimal numbers in the range of [0, 1], representing Cyan, Magenta,
//		  Yellow and Black.
//		  
//		  Output Format:
//		  A string, representing the corresponding RGB color, each component
//		  separated by commas.
//		  
//		  Sample Input:
//		  0.4
//		  0.49
//		  0.552
//		  0.36
//		  
//		  Sample Output:
//		  98,83,73
		 
		System.out.println("CMYK to RGB\n" + 
				"\n" + 
				"Problem:\n" + 
				"The CMYK color model is the standard in the printing industry and refers to\n" + 
				"the primary colors of pigment: Cyan, Magenta, Yellow, and Black. K stands for\n" + 
				"'Key' since in 4-color printing the Cyan, Magenta and Yellow printing plates\n" + 
				"are carefully keyed or aligned with the key of the Black key plate. RGB (Red,\n" + 
				"Green and Blue) is the color space for digital images.￼\n" + 
				"\n" + 
				"Task:\n" + 
				"Given a color in CMYK format, output the corresponding RGB color.\n" + 
				"\n" + 
				"Input Format:\n" + 
				"4 decimal numbers in the range of [0, 1], representing Cyan, Magenta,\n" + 
				"Yellow and Black.\n" + 
				"\n" + 
				"Output Format:\n" + 
				"A string, representing the corresponding RGB color, each component\n" + 
				"separated by commas.\n" + 
				"\n" + 
				"Sample Input:\n" + 
				"0.4\n" + 
				"0.49\n" + 
				"0.552\n" + 
				"0.36\n" + 
				"\n" + 
				"Sample Output:\n" + 
				"98,83,73\n" +
				"\n" +
				"****************************************************************************\n");
		
		System.out.println("Please enter CMYB numbers as described above:");
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
		
		System.out.println("\nRGB Numbers:\n" + (int)RD + "," + (int)GD + "," +(int)BD);

	}

}
