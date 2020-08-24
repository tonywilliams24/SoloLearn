package hardSecurity;

import java.util.ArrayList;
import java.util.Scanner;

public class Security
{

	public static void main(String[] args)
	{
		
		
		
//		  Security
//		  
//		  Problem: 
//		  You are in charge of security at a casino, and there is a thief who is trying
//		  to steal the casino's money! Look over the security diagrams to make sure
//		  that you always have a guard between the thief and the money! There is one
//		  money location, one thief, and any number of guards on each floor of the
//		  casino.
//		  
//		  Task:
//		  Evaluate a given floor of the casino to determine if there is a guard
//		  between the money and the thief, if there is not, you will sound an alarm.
//		  
//		  Input Format:
//		  A string of characters that includes $ (money), T (thief), and G (guard),
//		  that represents the layout of the casino floor. Space on the casino
//		  floor that is not occupied by either money, the thief, or a guard is
//		  represented by the character x.
//		  
//		  Output Format:
//		  A string that says 'ALARM' if the money is in danger or 'quiet'
//		  if the money is safe.
//		  
//		  Sample Input:
//		  xxxxxGxx$xxxT
//		  
//		  Sample Output:
//		  ALARM
		 
		 
		System.out.println("Security\n" + 
				"\n" + 
				"Problem: \n" + 
				"You are in charge of security at a casino, and there is a thief who is trying\n" + 
				"to steal the casino's money! Look over the security diagrams to make sure\n" + 
				"that you always have a guard between the thief and the money! There is one\n" + 
				"money location, one thief, and any number of guards on each floor of the\n" + 
				"casino.\n" + 
				"\n" + 
				"Task:\n" + 
				"Evaluate a given floor of the casino to determine if there is a guard\n" + 
				"between the money and the thief, if there is not, you will sound an alarm.\n" + 
				"\n" + 
				"Input Format:\n" + 
				"A string of characters that includes $ (money), T (thief), and G (guard),\n" + 
				"that represents the layout of the casino floor. Space on the casino\n" + 
				"floor that is not occupied by either money, the thief, or a guard is\n" + 
				"represented by the character x.\n" + 
				"\n" + 
				"Output Format:\n" + 
				"A string that says 'ALARM' if the money is in danger or 'quiet'\n" + 
				"if the money is safe.\n" + 
				"\n" + 
				"Sample Input:\n" + 
				"xxxxxGxx$xxxT\n" + 
				"\n" + 
				"Sample Output:\n" + 
				"ALARM\n" +
				"\n" + 
				"****************************************************************************\n");
		
		System.out.println("Please enter a string matching the format above: ");
		Scanner in = new Scanner(System.in);
		String floor = in.nextLine();
		int S = floor.indexOf('$');
		int T = floor.indexOf('T');
		ArrayList<Integer> G = new ArrayList<>();
		int i = -1;
		boolean bool=true;
		while(true)
		{
			i = floor.indexOf('G', ++i);
			if(i==-1) break;
			G.add(i);
		}
		if(G.size()!=0);
		for(int j=0; j<G.size(); j++)
		{
			if((S<G.get(j) && T>G.get(j)) || (S>G.get(j) && T<G.get(j)))
			{
				bool = false;
				break;
			}
				
		}
			if(bool) System.out.println("\nSound Alarm?:\nALARM");
			else System.out.println("\nSound Alarm?:\nquiet");
			
	}

}
