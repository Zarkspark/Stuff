import java.util.Scanner;
import java.util.Random;
import java.lang.String;

class game extends delete
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What games would you like to play?");
		System.out.println("Options: number game,");
		System.out.println("Please choose now.");
		String game = in.nextLine();
		if(game.equals("number game"))
		{
			menu();
		}
		delete();
	}
	
	public static void menu(String []args);
	{
		Scanner in = new Scanner(System.in);
		// Create a random class variable and call it random
		Random random = new Random();
		// Ask the user for a difficulty
		System.out.println("You have a choice of the easy, medium and hard. Please choose the difficulty for this game.");
		String difficulty = in.nextLine();
		// Generate a random number variable
		int randomNumber = 0;
		int attempt = 0;
		int limit = 0;
		
		if(difficulty.equals("easy"))
		{
			limit = 10;
			randomNumber = random.nextInt(limit)+1;
			attempt = 5;
		}
		
		else if(difficulty.equals("medium"))
		{
			limit = 50;
			randomNumber = random.nextInt(limit)+1;
			attempt = 10;
		}
		
		else if(difficulty.equals("hard"))
		{
			limit = 100;
			randomNumber = random.nextInt(limit)+1;
			attempt = 15;
		}
		
		else
		{
			System.out.println("Please choose the appropriate difficulty and try again");
		}
		
		// Tell the use of what the program is about
		System.out.println("This piece of code will generate a random number between 1 and "+limit+". Try and guess the number correctly.");
		// read the number from the user and hold it as an int variable guess
		int guess = in.nextInt();
		attempt = attempt - 1;
		
		// While the guess number is not the same, the randomNumber generated by Java, keep repeating in the while-loop
		while(guess!=randomNumber && attempt>0)
		{
			attempt = attempt - 1;
			// if the guess number is less than the random number generated by Java
			if(guess<randomNumber)
			{
				// Tell the user the number they guessed was too small
				System.out.println("Your number is too small");
			}
			// else the guess number is more than the random number generated by Java
			else
			{
				// Tell the user the number they guessed was too big
				System.out.println("Your number is too big");
			}
			// Ask the user to guess another number
			System.out.println("Try to guess another number");
			// Read the new number from the user and store it in the guess variable
			guess = in.nextInt();
		}
		
		if(attempt==0)
		{
			System.out.println("You have used up all of your tries for this level, please try again.");
			guess = randomNumber;
		}
		
		else
		{
			// At this point in the code, the user has guessed the number generated by Java.
			// Print on the screen that the user has guessed the number, and print out the randomNumber Java generated
			System.out.println("Well done, you have guessed the number which is " +randomNumber);
		}
	}
}