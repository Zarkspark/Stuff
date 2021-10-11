import java.util.Scanner;
import java.lang.String;

class compare extends delete
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("This code will compare 2 numbers and check which one is bigger or if they are the same.");
		System.out.println("Please enter the first number now.");
		int firstNumber = in.nextInt();
		System.out.println("Please enter the second number now.");
		int secondNumber = in.nextInt();
		
		String statement = menu(firstNumber, secondNumber);
		delete();
	}
	
	public static String menu(int firstNumber, int secondNumber)
	{
		String statement = "";
		if(firstNumber>secondNumber)
		{
			statement = "is bigger than";
			System.out.println(firstNumber+" "+statement+" "+secondNumber);
		}
		
		else if(firstNumber<secondNumber)
		{
			statement = "is smaller than";
			System.out.println(firstNumber+" "+statement+" "+secondNumber);
		}
		
		else
		{
			statement = "is the same as";
			System.out.println(firstNumber+" "+statement+" "+secondNumber);
		}
		
		
		
		return statement;
	}
}
