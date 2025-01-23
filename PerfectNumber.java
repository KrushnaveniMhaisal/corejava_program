/*Write a java program to check given number is perfect number or not*/

import java.util.Scanner;

class PerfectNumber
{
	public static void main(String arg[])
	{
		
		System.out.println("Enter number: ");

		Scanner sc=new Scanner(System.in);//creating Scanner object

		int num=sc.nextInt();//taking input from the user

		int sum=0;

		//iterating loop and adding the divisibility values
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
				sum+=i;
		}

		if(sum==num)
			System.out.println(num+" is perfect number");
		else
			System.out.println(num+" is not perfect number");
	}
}

/*Output:
Enter number:
6
6 is perfect number

Enter number:
2
2 is not perfect number
 */