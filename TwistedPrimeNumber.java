//A number is called a twisted prime number if it is a prime number and reverse of this number is also a prime number.


import java.util.Scanner;
class TwistedPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int ip = sc.nextInt();
	
		int num = ip;
		int rev = 0;

		while(ip > 0)
		{
			int rem = ip % 10;
				rev = rem + rev*10;
				ip = ip/10;
		}

		if(checkPrime(rev) && checkPrime(num))
		{
			System.out.println("It's twisted prime number ");
		}
		else
		{
			System.out.println("It's not a twisted prime number ");
		}
	}


	public static boolean checkPrime(int num)
	{
		if(num == 1)
		{
			return false;
		}
		else
		{
			for(int i=2; i<num; i++)
			{
				if(num % i == 0)
				{
					return false;
				}
			}
			return true;
		}
	}

}

/*
	public static boolean checkReversePrime(int num)
	{
		int rev = 0;

		while(num > 0)
		{
			int rem = num % 10;
				rev = rev*10 + rem;
				num = num/10;
		}

		if(checkPrime(rev))
		{
			return true;
		}
	}
	return false;
}

*/