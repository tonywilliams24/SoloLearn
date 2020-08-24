package hexColorCodeGenerator;

import java.util.Scanner;

public class HexColorCodeGenerator 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int RGB[] = new int[3];
		StringBuilder H = new StringBuilder("#");
		
		for(int i=0; i<RGB.length; i++) 
		{
			RGB[i] = in.nextInt();
			for(int j=i*2; j<(i*2)+2;j++)
			{
				if(j%2==0)
				{
					H.append(Integer.toString(RGB[i]/16,16));
				}
				else
				{
					H.append(Integer.toString(RGB[i]%16,16));
				}
			}	
		}
		in.close();
		
		System.out.println(H);

	}

}
