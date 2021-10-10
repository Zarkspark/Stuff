import java.util.Scanner;
import java.lang.String;

class fibonnaci
{
	public static void main(String []args)
	{
		
		int option = menu();
		
		if (option==1)
		{
			
			Scanner in = new Scanner(System.in);
			System.out.println("You chose option 1.");
			System.out.println("Now please choose the size of the sequence.");
			int size = in.nextInt();
			System.out.println("Now type out the numbers with a comma in between and one comma after the last number");
			in = new Scanner(System.in);
			String sequence = in.nextLine();
			String answer = generateFibonnaciSequence(sequence, size);
		}
	}
	
	public static int menu()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("This code is about fibbonaci sequences");
		System.out.println("Please enter an option: 1 is to generate one using");
		System.out.print("2 numbers and the length of the sequence. ");
		int option = in.nextInt();
		
		return option;
	}
	
	public static String generateFibonnaciSequence(String sequence, long size)
	{
		long firstComma = sequence.indexOf(",");
		long secondComma = sequence.indexOf(",", firstComma+1);
		
		String firstNumberString = sequence.substring(0,firstComma);
		long firstNumber = Long.parseLong(firstNumberString);
		
		String secondNumberString = sequence.substring(firstComma+1);
		long secondNumber = Long.parseLong(secondNumberString);
		
		long nextNumber = 0;
		
		for(long i=0; i<size; i++)
		{
			nextNumber = firstNumber + secondNumber;
			sequence = sequence + "," + nextNumber;
			
			firstNumber = secondNumber;
			secondNumber = nextNumber;
			
			System.out.println(sequence);
		}
		return sequence;
	}
}