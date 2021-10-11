import java.util.Scanner;

class PrimeGenerator extends delete
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("This code will calculate whether your number is a prime number so please choose a number");
		int numberOfPrime = in.nextInt();
		
		int numberOfPrimesFound = 0;
		
		for(int i=2; numberOfPrimesFound<=numberOfPrime; i++)
		{
			if(isPrime(i) == true)
			{
				numberOfPrimesFound = numberOfPrimesFound + 1;	
			}
		}
		delete();
	}
	
	public static boolean isPrime(int number)
	{
		
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
			System.out.println(number +" is prime");
			return true;
		}
		else
		{
			return false;
		}
	}
}
