package week1.day2.arrays;

import java.util.Arrays;

public class MissingElementInArray 
{

	public static void main(String[] args) 
	{

		int a[]={1,2,3,4,7,6,8};
		int n=8;
		Arrays.sort(a);
		for (int i =0; i <=n-1; i++) 
		{
			if(a[i]+1!=a[i+1])
			{
		      System.out.println("Missing Number is "+ (a[i]+1));
			  break;
			}
		
		}
	}
				
	}
			
			
	




