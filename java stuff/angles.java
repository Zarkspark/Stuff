import java.lang.String;
import java.util.Scanner;

class angles extends delete
{
	public static void main(String[] args)
	{
		int option = menu();
		
		if(option == 1)
		{
			Scanner in = new Scanner(System.in);
			// read the number of sides from the user
			System.out.println("Please enter a number of sides.");
			int sides = in.nextInt();
			// call the sumOfInteriorAngles method with the number of sides the user entered
			int totalAngles = sumOfInteriorAngles(sides);
			// display to the user the sum of interior angles of the polygon
			System.out.println(totalAngles);
		}
		
		if(option == 2)
		{
			Scanner in = new Scanner(System.in);
			// read the number of sides from the user
			System.out.println("Please enter a number of sides.");
			int sides = in.nextInt();
			// call the exteriorAngles method with the number of sides the user entered
			int exteriorAngle = exteriorAngles(sides);
			// display to the user the exterior angle of the polygon
			System.out.println(exteriorAngle);
		}
		
		if(option == 3)
		{
			Scanner in = new Scanner(System.in);
			// read the number of sides from the user
			System.out.println("Please enter the sum of interior angles of any polygon.");
			int sumOfAngles = in.nextInt();
			// call the exteriorAngles method with the number of sides the user entered
			int calculation = numberOfSides(sumOfAngles);
			// display to the user the exterior angle of the polygon
			System.out.println(calculation);
		}
		delete();
	}
	
	public static int menu()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("This code calculates the sum of interior angles given the number of sides.");
		System.out.println("Press 1 to calculate the sum of interior angles of any polygon");
		System.out.println("Press 2 to calculate an exterior angle of any polygon");
		System.out.println("Press 3 to calculate the number of sides of any polygon using the sum of interior angles.");
		int option = in.nextInt();
		// return the option
		return option;
	}
	
	// This method takes as an input the number of sides of a polygon
	// it returns the sum of interior angles of the polygon
	public static int sumOfInteriorAngles(int sides)
	{
		// do the calculation for the sum of interior angles of a polygon
		int sumOfAngles = (sides-2) * 180;
		
		// return the sumOfAngles variable
		return sumOfAngles;
	}
	
	// This method takes the number of sides of a polygon and returns the exterior angle
	public static int exteriorAngles(int sides)
	{
		// calculate the interior angle using the interiorAngle method
		int interiorAngle = ((sides-2) * 180)/sides;
		// subtract the interior angles from 180 degrees to calculate the exterior angle
		int exteriorAngle =  180 - interiorAngle;
		// return the exteriorAngle
		return exteriorAngle;
	}
	
	
	// This method takes as an input the sum of interior of a polygon and returns
	// the number sides the polygon has
	public static int numberOfSides(int sumOfAngles)
	{
		// divide the sum of interior angles by 180
		int calculation = sumOfAngles/180;
		// this answer needs to be divided by 2
		calculation = calculation/2;
		// return calculation variable which hold the number of sides the polygon has
		return calculation;
	}
	
}