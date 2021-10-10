import java.util.Scanner;
import java.lang.String;

class Percentage
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Choose a percentage number.");
		double percentage = in.nextDouble();
		double percentMultiplier = percentage/ 100;
		System.out.println("Now choose a number.");
		double amount = in.nextDouble();
		double calc = percentOfNumber(percentage, amount);
		System.out.println("Choose 1 to increase or 2 to decrease.");
		int decision = in.nextInt();
		if (decision==1)
		{
			double increase = percentIncrease(amount, percentage);
		}
		else if (decision==2)
		{
			double decrease = (amount, percentage);
		}
		else
		{
			
		}
	}
	
	public static double percentIncrease(double amount, double percent)
	{
		double add = amount + calc;
		System.out.println(add+" is your answer.");
		return add;
	}
		public static double percentDecrease(double amount, double percent)
	{
		double subtract = amount + calc;
		System.out.println(subtract+" is your answer.");
		return subtract;
	}
	
	public static double percentOfNumber(double percent, double amount)
	{
		double percentMultiplier = percent/ 100;
		double calculation = amount * percentMultiplier;
		System.out.println(calculation+" is the answer.");
		return calculation;
	}
	
}