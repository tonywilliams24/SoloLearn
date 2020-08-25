package mediumCamelToSnake;

import java.util.Scanner;

public class CamelToSnake 
{

	public static void main(String[] args) 
	{
		
		
//		  Camel to Snake
//		  
//		  Problem:
//		  The company you are working for is refactoring its entire codebase. It's
//		  changing all naming conventions from camel to snake case (camelCasing to
//		  snake_casing). Every capital letter is replaced with its lowercase prefixed
//		  by an underscore _, except for the first letter, which is lowercased without
//		  the underscore, so that SomeName becomes some_name.
//		  
//		  Task:
//		  Write a program that takes in a string that has camel casing, and
//		  outputs the same string but with snake casing.
//		  
//		  Input Format:
//		  A string with camelCasing.
//		  
//		  Output Format:
//		  The same string but with snake_casing.
//		  
//		  Sample Input:
//		  camelCasing
//		  
//		  Sample Output:
//		  camel_casing
		 
		
		System.out.println("Camel to Snake\n" + 
				"\n" + 
				"Problem:\n" + 
				"The company you are working for is refactoring its entire codebase. It's\n" + 
				"changing all naming conventions from camel to snake case (camelCasing to\n" + 
				"snake_casing). Every capital letter is replaced with its lowercase prefixed\n" + 
				"by an underscore _, except for the first letter, which is lowercased without\n" + 
				"the underscore, so that SomeName becomes some_name.\n" + 
				"\n" + 
				"Task:\n" + 
				"Write a program that takes in a string that has camel casing, and\n" + 
				"outputs the same string but with snake casing.\n" + 
				"\n" + 
				"Input Format:\n" + 
				"A string with camelCasing.\n" + 
				"\n" + 
				"Output Format:\n" + 
				"The same string but with snake_casing.\n" + 
				"\n" + 
				"Sample Input:\n" + 
				"camelCasing\n" + 
				"\n" + 
				"Sample Output:\n" + 
				"camel_casing\n" + 
				"\n" +
				"****************************************************************************\n");
				
		System.out.println("Input String with camelCasing:");
		Scanner in = new Scanner(System.in);
		String camel = in.nextLine();
		StringBuilder snake = new StringBuilder(Character.toString(Character.toLowerCase(camel.charAt(0))));
		for(int i=1; i<camel.length();i++)
		{
			char c = camel.charAt(i);
			if(Character.isUpperCase(c))
			{
				snake.append('_');
				c = Character.toLowerCase(c);
				snake.append(c);
			}
			else
			{
				snake.append(c);
			}
			
		}
		System.out.println("\nIn camel_casing:\n" + snake.toString());
			
	}

}
