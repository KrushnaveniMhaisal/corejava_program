/*Write a program to check given number is prime number or not*/

import java.util.Scanner;

class PrimeNumber
{
	public static void main(String arg[])
	{
		System.out.println("Enter number");

		Scanner sc=new Scanner(System.in);//creating Scanner object

		int num=sc.nextInt();//taking input from the user

		int flag=0;

		//iterating loop for checking if there is any number which is divisible
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				flag=1;
				break;
		}

		if(flag==0)
			System.out.println(num+" is prime number");
		else
			System.out.println(num+" is not prime number");

	}
}

/* Output:
Enter number
2
2 is prime number

Enter number
4
4 is not prime number
*/