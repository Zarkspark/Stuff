import java.util.Scanner;

class Factors extends delete
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("This code will calculate all factors so please choose a number");
		int number = in.nextInt();
		
		for(int i=1; i<=number; i++)
		{
			int factorCalc = number%i;
			if (factorCalc==0)
			{
				System.out.println( i +" is a factor of " + number);
			}
		}
		delete();
	}
}