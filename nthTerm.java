import java.util.Scanner;
import java.lang.String;

class nthTerm
{
	static int difference = 0;
	static int beforeFirst = 0;
	
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Choose a number that might be part of a random sequence.");
		int userNumber = in.nextInt();
		String sequence = "11,22,33,44,55";
		
		
		nthTermRule(sequence);
		isTermInSequence(userNumber);
		findTermInSequence(5);
		
	}
	
	public static void nthTermRule(String sequence)
	{
		int firstComma = sequence.indexOf(",");
		int secondComma = sequence.indexOf(",", firstComma+1);
		int thirdComma = sequence.indexOf(",", secondComma+1);
		System.out.println("The position of the first comma is :"+ firstComma);
		System.out.println("The position of the second comma is :"+ secondComma);
		String firstNumberString = sequence.substring(0,firstComma);
		System.out.println("The first number is: "+ firstNumberString);
		int firstNumber = Integer.parseInt(firstNumberString);
		String secondNumberString = sequence.substring(firstComma+1,secondComma);
		System.out.println("The second number is: "+ secondNumberString);
		int secondNumber = Integer.parseInt(secondNumberString);
		String thirdNumberString = sequence.substring(secondComma+1,thirdComma);
		System.out.println("The third number is: "+ thirdNumberString);
		int thirdNumber = Integer.parseInt(thirdNumberString);
		
		difference = secondNumber - firstNumber;
		System.out.println(difference+" is the nth term.");
		
		beforeFirst = firstNumber - difference;
		System.out.println(beforeFirst+" is the number before the first number.");
		
		String nthRule = difference+"n +" + beforeFirst;
		System.out.println(nthRule);
		
	}
	
	public static int findTermInSequence(int position)
	{
		int calculation = 0;
		calculation = difference * position - beforeFirst;
		return calculation;
		
	}
	
	public static boolean isTermInSequence(int term)
	{
		
		for (int i=1; ; i++)
		{
			// make i as the position
			int calculation = findTermInSequence(i);
			
			if (calculation == term)
			{
			// Identifies whether number is in sequence or not
				System.out.println("Your number is in the sequence");
				return true;
			}
			
			if (calculation > term)
			{
				System.out.println("Your number is not in the sequence");
				return false;
			}
		}
	}
}