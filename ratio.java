import java.util.Scanner;
import java.lang.String;

class ratio
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("This piece of code will divide a number of your choosing by a certain ratio, of your choosing");
		System.out.println("Would you like to do 3 ratios?");
		String ratioAmount = in.nextLine();
		boolean ratio3Op = false;
		if(ratioAmount.equals("yes"))
		{
			ratio3Op = true;
		}
		else
		{
			ratio3Op = false;
		}
		System.out.println("Choose the number.");
		int number = in.nextInt();
		System.out.println("Now the ratio.");
		in = new Scanner(System.in);
		String ratio = in.nextLine();
		int[] array = makeArray(ratio);
		printArray(array);
	}
	
	public static int[] makeArray(String numbers)
	{
		int commaCount = 0;
		int lastCommaPosition = 0;
		
		// find out how many numbers there are
		for(int i=0; lastCommaPosition != -1; i++)
		{
			// look for the position of the next comma
			lastCommaPosition = numbers.indexOf(":", lastCommaPosition+1);
			if( lastCommaPosition != -1)
			{
				// if a comma is found increment the commaCount variable by 1 
				commaCount = commaCount + 1;
			}
		}
		
		
		// There will be 1 less comma's than the number of numbers in the sequence,
		// so make the size of the array 1 more than the number of comma's
		int[] numbersArray = new int[commaCount + 1];
		
		
		int commaPosition = 0;
		lastCommaPosition = 0;
		String numberString = "";
		int number = 0; 
		
		// get the first number into the array
		lastCommaPosition = numbers.indexOf(":", lastCommaPosition+1);
		numberString = numbers.substring(commaPosition, lastCommaPosition);
		numbersArray[0] = Integer.parseInt(numberString);
		commaPosition = lastCommaPosition;
			
		for(int i=1; i<	commaCount; i++)
		{
			// find the position position of the next comma
			lastCommaPosition = numbers.indexOf(":", lastCommaPosition+1);
			
			// find the number between the last 2 comma's. For the first number, this
			// is between the 0th position and the first comma
			numberString = numbers.substring(commaPosition+1, lastCommaPosition);
			// change the numberString into an int
			number = Integer.parseInt(numberString);
			// put the number into the next position of the array
			numbersArray[i] = number;
			// make the lastCommaPosition(second of the pair of comma positions) 
			// equal to the commaPosition (first of the pair of comma positions)
			commaPosition = lastCommaPosition;
		}
		
		// find the last number in the sequence 
		numberString = numbers.substring(lastCommaPosition+1, numbers.length());
		// put the last number into the last position of the array
		numbersArray[commaCount] = Integer.parseInt(numberString);
		
		// return the array of numbers
		return numbersArray;
	}
	
	public static void printArray(int[] array)
	{
		System.out.println("");
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i] + ":");
		}
		System.out.println("");
	}
}