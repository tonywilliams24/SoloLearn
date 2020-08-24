package hardItsASign;
 
import java.util.Scanner;

public class ItsASign
{

	public static void main(String[] args)
	{
		
		
//		  It's a Sign
//		  
//		  Problem:
//		  You work in a sign factory, and the machine has started printing all of the
//		  signs backwards! The signs have already been packed into boxes of four signs
//		  each. Every letter on every sign is capitalized, so if the original sign was
//		  of a palindrome (a word or phrase that is the same backwards and forwards)
//		  you can still save those signs and not have to reprint them. Check each box
//		  to see if you should open it up to dig out the sign you can save, or if you
//		  need to just throw the whole box in the trash.
//		  
//		  Task:
//		  Given the four words that were supposed to be contained in each box,
//		  determine if at least one of them is of a palindrome.
//		  
//		  Input Format: 
//		  Four strings that represent the word or phrase that was supposed
//		  to be printed on the signs inside each box.
//		  
//		  Output Format:
//		  A string that say 'Open' if at least one of the boxes is a
//		  palindrome or 'Trash' if all of the signs are misprinted.
//		  
//		  Sample Input:
//		  CAT
//		  MONDAYS
//		  RACECAR
//		  TACOS
//		
//		  Sample output:
//		  Open
		
		System.out.println("It's a Sign\n" + 
				"\n" + 
				"Problem:\n" +
				"You work in a sign factory, and the machine has started printing all of the\n" + 
				"signs backwards! The signs have already been packed into boxes of four signs\n" + 
				"each. Every letter on every sign is capitalized, so if the original sign was\n" + 
				"of a palindrome (a word or phrase that is the same backwards and forwards)\n" + 
				"you can still save those signs and not have to reprint them. Check each box\n" + 
				"to see if you should open it up to dig out the sign you can save, or if you\n" + 
				"need to just throw the whole box in the trash.\n" + 
				"\n" + 
				"Task:\n" + 
				"Given the four words that were supposed to be contained in each box,\n" + 
				"determine if at least one of them is of a palindrome.\n" + 
				"\n" + 
				"Input Format: \n" + 
				"Four strings that represent the word or phrase that was supposed\n" + 
				"to be printed on the signs inside each box.\n" + 
				"\n" + 
				"Output Format:\n" + 
				"A string that say 'Open' if at least one of the boxes is a\n" + 
				"palindrome or 'Trash' if all of the signs are misprinted.\n" + 
				"\n" + 
				"Sample Input:\n" + 
				"CAT\n" + 
				"MONDAYS\n" + 
				"RACECAR\n" + 
				"TACOS\n" + 
				"\n" + 
				"Sample output:\n" + 
				"Open" +
				"\n" + 
				"****************************************************************************\n");
		 
		System.out.println("Please enter four strings below:");
		Scanner in = new Scanner(System.in);
		String sign[] = new String[4];
		boolean bool = false;
		for(int i=0; i<4; i++)
		{
			if(!bool) 
			{
			sign[i] = in.nextLine().toUpperCase();
			String reverse = new StringBuilder(sign[i]).reverse().toString();
			if(sign[i].compareTo(reverse)==0) bool=true;
			}
		}
		if(bool) System.out.println("\nResult: Open");
		else System.out.println("\nResult: Trash");

	}

}
