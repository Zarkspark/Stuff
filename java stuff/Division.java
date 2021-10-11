import java.util.Scanner;
import java.lang.String;

class Division extends delete
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Choose the first number to divide.");
		int firstNumber = in.nextInt();
		System.out.println("Choose the second number to divide.");
		int secondNumber = in.nextInt();
		int remainder = firstNumber%secondNumber;
		int calculation = firstNumber / secondNumber;
		System.out.println("The answer is " + calculation + " with remainder " + remainder);
		delete();
	}
	
}