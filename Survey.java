import java.util.Scanner;
import java.lang.String;

class Survey
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Hello, thank you for participating in our Quiz. Please choose each choice with numbers 1,2 and 3.");
		System.out.println("Loading questions...");
		System.out.println("Waiting for user to be ready...");
		System.out.println("How do you print text in java? ");
		System.out.println("1) System.out.println(Text) 2) Say(Text) 3)(Text)");
		int answer = in.nextInt();
		if (answer==1)
		{
			System.out.println("Correct!");
		}
		else
		{
			System.out.println("Wrong, the answer was 1");
		}
		System.out.println("How do you make a String variable in java? ");
		System.out.println("1) Make String variable (name) 2) System.out.println(Name) 3) String (Name) = in.nextString(); ");
		if (answer==3)
		{
			System.out.println("Correct!");
		}
		else
		{
			System.out.println("Wrong, the answer was 3");
		}
	}
}