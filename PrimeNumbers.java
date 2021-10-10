import java.util.Scanner;

class PrimeNumbers
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("This code will calculate whether your number is a prime number so please choose a number");
		int number = in.nextInt();
		int factors = 0;
		
		for(int i=2; i<number; i++)
		{
			int calculation = number%i;
			if (calculation==0)
			{
				factors = factors + 1;
			}
		}
		if (factors==0)
		{
			System.out.println("This is a prime number.");
		}
		else
		{
			System.out.println("This isn't a prime number.");
		}
	}
}
