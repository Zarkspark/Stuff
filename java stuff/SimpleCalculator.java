import java.util.Scanner;
import java.lang.String;


class SimpleCalculator
{
	public static void main(String[]args)
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("Hello, please tell me your name.");
		String name = in.nextLine();
		System.out.println("Hello " + name + ",please tell me what operation you would like me to calculate.");
		System.out.println("1 for addition,2 for subtraction,3 for division or 4 for multiplication (please type the number)");
		int operation = in.nextInt();
		System.out.println("Give me the first number.");
		int firstNumber = in.nextInt();
		System.out.println("Now give me the second number.");
		int secondNumber = in.nextInt();
		int calculation = 0;
		int remainder = 0;
		if (operation==1)
			{
				System.out.println("The operation is addition");
				calculation = firstNumber + secondNumber;
			}
		 else if (operation==2)
		 	 {
		 	 	 calculation = firstNumber - secondNumber;
		 	 }
		 else if (operation==4)
		 	 {
		 	 calculation = firstNumber * secondNumber;
		 	 }
		 else if (operation==3)
		 	 {
		 	 calculation = firstNumber / secondNumber;
		 	 remainder = firstNumber%secondNumber;
		 	 }
		System.out.println("The answer is " + calculation + " with remainder " +remainder);
	}
	
}