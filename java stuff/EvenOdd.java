import java.util.Scanner;

class EvenOdd extends delete
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("This piece of code will identify whether your number is even or odd. Please type a number in.");
		int number = in.nextInt();
		int calculation = number%2;
		if (calculation==0)
		{
			System.out.println("This is a even number.");
		}
		else if (calculation==1)
		{
			System.out.println("This is an odd number.");
		}

		delete();
	}
}