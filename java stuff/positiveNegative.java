import java.util.Scanner;
import java.lang.String;

class positiveNegative
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("This piece of code will calculate whether your number is positive or negative.");
		System.out.println("Please enter a number now.");
		int number = in.nextInt();
		String decision = menu(number);
		System.out.println(decision);
	}
	
	public static String menu(int number)
	{
		String decision = "";
		
		if(number<0)
		{
			decision = "negative";
		}
		
		else
		{
			decision = "positive";
		}
		
		return decision;
	}
}