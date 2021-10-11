import java.util.Scanner;
import java.lang.String;

class averages extends delete
{
	
	public static void main(String []args)
	{
		int option = menu();
		System.out.println("Now please enter a comma-separated sequence.");
		Scanner in = new Scanner(System.in);
		String numbers = in.nextLine();
		
		
		System.out.println("Please choose the ascending option for this piece of code.");
		
		// Create a object of BubbleSort class
		BubbleSort bSort = new BubbleSort();
		int[] array = bSort.makeArray(numbers);
		
		
		//int[] array = makeArray(numbers);
		if(option==1)
		{
			double mean = mean(array);
			System.out.println(mean);
		}
		
		if(option==2)
		{
			double mode = mode(array);
			System.out.println(mode);
		}
		
		if(option==3)
		{                                                 
			double median = median(array);
			System.out.println(median);
		}
		
		if(option==4)
		{
			double range = range(array);
			System.out.println(range);
		}
		delete();
	}
	
	public static int menu()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("This code requires the user to enter either options: 1 to calculate mean, 2 for mode, 3 for median and 4 for range.");
		System.out.println("Please enter it now.");
		int option = in.nextInt();
		return option;
	}
	
	// This method takes an array of numbers, calculates the mean and returns it
	public static double mean(int[] array)
	{
		// set the size of the array
		int size = array.length;
		// set the double variable calculation to 0
		double calculation = 0;
		
		// loop through the elements in the array
		for(int i=0; i<array.length; i++)
		{
			// add each number to the calculation variable
			calculation = calculation + array[i];
		}
		
		// divide the numbers that were added by the size of the array to find the mean
		calculation = calculation/size;
		// return the mean
		return calculation;
	}
	
	// This method calculates the mode of an array of numbers and returns it
	public static double mode(int[] array)
	{
		// set the int variable currentMode to 0
		int currentMode = 0;
		// set the int variable currentMostOccuring to 0
		int currentMostOccuring = 0;
		
		// set the int variable numberToTest to 0
		int numberToTest = 0;
		// set the int variable count to 0
		int count = 0;
		
		
		// loop through each element in the array
		for(int i=0; i<array.length; i++)
		{
			// set the next element in the array to test how many times it occurs
			// after its position
			numberToTest = array[i];
			// set/reset the count to 0
			count = 0;
			// loop through the array from the point of the current element
			// to see how many times it occurs from that point
			for(int j=i; j<array.length; j++)
			{
				// if the current element is found, then add 1 to the count variable
				if(numberToTest == array[j])
				{
					count = count + 1;
				}
			}
			// if after looping through the 2nd loop, the count was more than the currentMostOccuring
			if(count > currentMostOccuring)
			{
				// set the currentMode variable to the number that was being tested
				currentMode = numberToTest;
				// set the currentMostOccuring to the count made
				currentMostOccuring = count;
			}
		}
		
		// return the mode calculated
		return currentMode;
	}
	
	// This method calculates the median of an array of numbers and returns it
	public static double median(int[] array)
	{
		BubbleSort bSort = new BubbleSort();
		// set the size of the array
		int size = array.length;
		// set the double variable calculation to 0
		double calculation = 0;
		// set the middlePosition variable to 0
		int middlePosition = 0;
		
		// sort the array in ascending order by calling the bubbleSortAscending method
		int[] newArray = bSort.bubbleSortAscending(array);
		
		// if the array is of an even length, then there will be 2 middle numbers
		if(size%2==0)
		{
			// find the middle position
			middlePosition = size/2;
			// add the 2 elements from the middle position and one after it
			calculation = newArray[middlePosition-1] + newArray[middlePosition];
			// divide the calculation by 2 to find half way between the 2 middle numbers
			calculation = calculation/2;
		}
		// if the array is of an odd length, then there will only be 1 middle number
		else
		{
			// find the middle position
			middlePosition = size/2;
			
			// use the middle number in the array to find the median and set it to calculation
			calculation = newArray[middlePosition];
		}
		
		// return the median
		return calculation;
	}
	
	// This method calculates the range from an array of numbers and returns it
	public static int range(int[] array)
	{
		// set the int variable smallest to the first element in the array to start with
		int smallest = array[0];
		// set the int variable biggest to the first element in the array to start with
		int biggest = array[0];
		
		// loop through the elements of the array
		for(int i=0; i<array.length; i++)
		{
			// if the next element if bigger than the biggest variable,
			// set it to the biggest variable
			if(array[i]>biggest)
			{
				biggest = array[i];
			}
			
			// if the next element if smaller than the smallest variable,
			// set it to the smallest variable
			if(array[i]<smallest)
			{
				smallest = array[i];
			}
		}
		
		// calculate the range from the biggest and smallest numbers
		int range = biggest-smallest;
		
		// return the range
		return range;
	}
	
	
	/*
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
		
		// get the first number into the array
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
	}*/
}
