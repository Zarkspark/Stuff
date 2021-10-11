import java.util.Scanner;
import java.lang.String;

class login extends delete
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String yesNo = "";
		String username = "";
		while (!yesNo.equals("yes"))
		{
			System.out.println("Please type a username.");
			username = in.nextLine();
			System.out.println("This is your username, Yes or No?" + username);
			yesNo = in.nextLine();
		}
		if (yesNo.equals("yes"))
		{
			System.out.println("That's it!");
		}
		delete();
	}
}