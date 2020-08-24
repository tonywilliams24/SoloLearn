package mediumMissingNumebrs;

import java.util.ArrayList;
import java.util.Scanner;

public class MissingNumbers
{

	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		int arr[] = new int[len];
		ArrayList<Integer> nums = new ArrayList<>();
		arr[0] = in.nextInt();
		for(int i = 1; i<len; i++)
		{
			arr[i] = in.nextInt();
			if(arr[i]-arr[i-1]!=1)
			{
			nums = missing(arr[i],arr[i-1], nums);
			}
		}
		System.out.println(nums.toString().replaceAll("\\[","").replaceAll("\\]", "").replaceAll(",", ""));
	}
	static ArrayList<Integer> missing(int max, int min, ArrayList<Integer> list)
	{
		if(max - min != 1)
		{
			min++;
			list.add(min);
			missing(max, min, list);
		}
		return list;
	}

}
