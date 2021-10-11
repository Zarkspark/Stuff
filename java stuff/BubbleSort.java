import java.util.Scanner;
import java.lang.String;

class BubbleSort extends delete
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("This code will sort 3 numbers into ascending/descending order.");
		System.out.println("Now please enter in a 3 random numbers (Put commas in between the numbers please).");
		String numbers = in.nextLine();
		System.out.println("Now please enter option 1 for ascending order or option 2 for descending order.");
		int option = in.nextInt();
		int[] array = makeArray(numbers);
		printArray(array);
		int[] bubbleSortedArray = {0};
		if(option==1)
		{
			bubbleSortedArray = bubbleSortAscending(array);
		}
		if(option==2)
		{
			bubbleSortedArray = bubbleSortDescending(array);
		}
		printArray(bubbleSortedArray);
		delete();
	}
	
	public static int[] bubbleSortAscending(int[] numberArray)
	{
		// Set a boolean variable sorted to false. This tells if the list is sorted or not
		boolean sorted = false;
		// Set an int variable number1 to 0
		int number1 = 0;
		// Set an int variable number2 to 0
		int number2 = 0;
		// Set an int variable arrayLength to be the length of the array 
		int arrayLength = numberArray.length;
		
		// Keep doing this while loop as long as the array is not sorted
		while(sorted == false)
		{
			
			// Assume the array is sorted unless a pair of numbers has to be swapped in the loop
			sorted = true;
			
			// Loop through the array, comparing 2 numbers at a time
			for(int i=0; i<arrayLength-1; i++)
			{
				// set number1 to be the next number in the sequence
				number1 = numberArray[i];
				// set number2 to be the number after in the sequence
				number2 = numberArray[i+1];
				// if number2 is less than number1, they need to be swapped
				if(number2<number1)
				{
					// set the number in the i position to be number2
					numberArray[i] = number2;
					// set the number in the i+1 position to be number1
					numberArray[i+1] = number1;
					// since numbers in the array were swapped, set the sorted to false,
					// in case more numbers need to be swapped
					sorted = false;
				}
			}
		}
		
		// return the sorted array
		return numberArray;
	}
		
	public static int[] bubbleSortDescending(int[] numberArray)
	{
		// Set a boolean variable sorted to false. This tells if the list is sorted or not
		boolean sorted = false;
		// Set an int variable number1 to 0
		int number1 = 0;
		// Set an int variable number2 to 0
		int number2 = 0;
		// Set an int variable arrayLength to be the length of the array 
		int arrayLength = numberArray.length;
	
		// Keep doing this while loop as long as the array is not sorted
		while(sorted == false)
		{
		
			// Assume the array is sorted unless a pair of numbers has to be swapped in the loop
			sorted = true;
		
			// Loop through the array, comparing 2 numbers at a time
			for(int i=0; i<arrayLength-1; i++)
			{
				// set number1 to be the next number in the sequence
				number1 = numberArray[i];
				// set number2 to be the number after in the sequence
				number2 = numberArray[i+1];
				// if number2 is more than number1, they need to be swapped
				if(number2>number1)
				{
					// set the number in the i position to be number2
					numberArray[i] = number2;
					// set the number in the i+1 position to be number1
					numberArray[i+1] = number1;
					// since numbers in the array were swapped, set the sorted to false,
					// in case more numbers need to be swapped
					sorted = false;
				}
			}
		}
		
		// return the sorted array
		return numberArray;
	}
	
	public static void printArray(int[] array)
	{
		System.out.println("");
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i] + ",");
		}
		System.out.println("");
	}
	
	
	// This method turns a comma separated list of numbers as a String into an 
	// array of int values
	public static int[] makeArray(String numbers)
	{
		int commaCount = 0;
		int lastCommaPosition = 0;
		
		// find out how many numbers there are
		for(int i=0; lastCommaPosition != -1; i++)
		{
			// look for the position of the next comma
			lastCommaPosition = numbers.indexOf(",", lastCommaPosition+1);
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
		
		// get the first number into the arry
		lastCommaPosition = numbers.indexOf(",", lastCommaPosition+1);
		numberString = numbers.substring(commaPosition, lastCommaPosition);
		numbersArray[0] = Integer.parseInt(numberString);
		commaPosition = lastCommaPosition;
			
		for(int i=1; i<	commaCount; i++)
		{
			// find the position position of the next comma
			lastCommaPosition = numbers.indexOf(",", lastCommaPosition+1);
			
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
	
}

