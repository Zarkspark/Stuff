import java.util.Scanner;
import java.lang.String;

class time
{
	public static void main(String []args)
	{
		String time = menu();
	}
	
	public static String menu()
	{
		Scanner timeInput = new Scanner(System.in);
		System.out.println("This code will change your time from 12 hour to 24 hour form or vice versa. Please choose 1 to change your time from 12 hour to 24 hour form and 2 to change your time from 24 hour to 12 hour form");
		int choice = in.nextInt();
		String time = "";
		String twentyFourHourTime = "";
		String twelveHourTime = "";
		if (choice==1)
		{
			System.out.println("Please enter a time with am or pm and a colon(EG:9:25am)");
			timeInput = new Scanner(System.in);
			time = in.nextLine();
			twentyFourHourTime = change12To24HourTime(time);
			System.out.println(twentyFourHourTime);
		}
		
		else if (choice==2)
		{

			System.out.println("Please enter a time with a colon(EG:09:25)");
			timeInput = new Scanner(System.in);
			time = in.nextLine();
			twelveHourTime = change24To12HourTime(time);
			System.out.println(twelveHourTime);
		}
		return time;
	}
	
	public static String change12To24HourTime(String twelveHourTime)
	{
		int colonPosition = twelveHourTime.indexOf(":");
		System.out.println("colon is" +colonPosition);
		
		String hour = twelveHourTime.substring(0,colonPosition);
		System.out.println("Hours are" +hour);
		int hoursInt = Integer.parseInt(hour);
		
		String mins = twelveHourTime.substring(colonPosition+1,colonPosition+3);
		System.out.println("minutes are" +mins);
		int minsInt = Integer.parseInt(mins);
		
		
		String ampm = twelveHourTime.substring(colonPosition+3,colonPosition+5);
		String twentyFourHourTime = "";      
		if (hoursInt == 12 && ampm.equals("am"))
		{
			hour = "00";
			System.out.println("Hours are" +hour);
			twentyFourHourTime = hour+":"+mins;
		}
		
		else if (hoursInt == 12 && ampm.equals("pm"))
		{
			twentyFourHourTime = hour+":"+mins;
		}
		
		else if (ampm.equals("pm"))
		{
			hoursInt = hoursInt + 12;
			System.out.println(hoursInt);
			twentyFourHourTime = hoursInt+":"+minsInt;
		}
		
		else if (ampm.equals("am")  && hoursInt <= 9)
		{
			hour = "0"+hour;
			twentyFourHourTime = hour+":"+mins;
		}
		
		else if (ampm.equals("am")  && hoursInt >= 10)
		{
			twentyFourHourTime = hour+":"+mins;
		}
		
		return twentyFourHourTime;
	}
	
	public static String change24To12HourTime(String twentyFourHourTime)
	{	
		int colonPosition = twentyFourHourTime.indexOf(":");
		System.out.println("colon is" +colonPosition);
		
		String hour = twentyFourHourTime.substring(0,colonPosition);
		System.out.println("Hours are" +hour);
		int hoursInt = Integer.parseInt(hour);
		
		String mins = twentyFourHourTime.substring(colonPosition+1,colonPosition+3);
		
		System.out.println("minutes are" +mins);
		int minsInt = Integer.parseInt(mins);
		
		
		String ampm = "";
		
		if (hoursInt == 12)
		{
			ampm = "pm";
		}
		
		else if (hoursInt == 00)
		{
			hoursInt = 12;
			hour = Integer.toString(hoursInt);
			ampm = "am";
		}
		
		else if (hoursInt > 12)
		{
			hoursInt = hoursInt - 12;
			hour = Integer.toString(hoursInt);
			ampm = "pm";
		}
		
		else if (hoursInt < 10)
		{
			hour = ""+hour;
			ampm = "am";
		}
		
		else
		{
			ampm = "am";
		}
		
		String twelveHourTime = hour+":"+mins+ampm;
		
		return twelveHourTime;
	}
}