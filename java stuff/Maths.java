import java.util.Scanner;
import java.lang.String;

class MathsCalculator extends delete
{
	public static void main(String[]args)
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("Hello, please tell me your name.");
		String name = in.nextLine();
		System.out.println("Hello " + name + ",please tell me what operation you would like me to calculate.");
		System.out.println("+ addition,- subtraction,/ division or * multiplication (please type the symbol)");
		String operation = in.nextLine();
		System.out.println("Give me the first number.");
		int firstNumber = in.nextInt();
		System.out.println("Now give me the second number.");
		int secondNumber = in.nextInt();
		int calculation = 0;
		if (operation.equals("+"))
			{
				System.out.println("The operation is addition");
				calculation = firstNumber + secondNumber;
			}
		 else if (operation.equals("-"))
		 	 {
		 	 	 calculation = firstNumber - secondNumber;
		 	 }
		 else if (operation.equals("*"))
		 	 {
		 	 calculation = firstNumber * secondNumber;
		 	 }
		 else if (operation.equals("/"))
		 	 {
		 	 calculation = firstNumber / secondNumber;
		 	 }
		System.out.println("The answer is " +calculation);
		delete();
	}
	
} 