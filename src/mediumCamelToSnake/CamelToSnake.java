package mediumCamelToSnake;

import java.util.Scanner;

public class CamelToSnake 
{

	public static void main(String[] args) 
	{
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
		System.out.println(snake.toString());
			
	}

}
