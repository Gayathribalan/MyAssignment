package week1.day2;

public class FibonacciSeries 
{
	

	public static void main(String[] args) 
	{
		int val=8;
		int num1=0, num2=1,temp=0;
		System.out.println(num1);
		System.out.println(num2);
		for (int i=2; i<8; i++) 
		{
			temp=num1+num2;
			num1=num2;
			num2=temp;
			System.out.println(temp);
		}
	

	}

}
