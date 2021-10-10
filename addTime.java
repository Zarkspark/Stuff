import java.util.Scanner;
import java.lang.String;

class addTime
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("This code will add time to a 24hr time. Please input the number of hours you would like to add");
		int addHours = in.nextInt();
		System.out.println("Please input the number of minutes you would like to add");
		int addMins = in.nextInt();
		
		String twentyFourHourTime = menu();
		addTimeToTwentyFourHourTime(twentyFourHourTime, addHours, addMins);
	}
	
	public static String menu()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the time you would like to have.");
		
		String time = input.nextLine();
		System.out.println(time);
		return time;
	}
	
	public static String addTimeToTwentyFourHourTime(String twentyFourHourTime, int addHour, int addMins)
	{
		int colonPosition = twentyFourHourTime.indexOf(":");
		String hour = twentyFourHourTime.substring(0, colonPosition);
		int hoursInt = Integer.parseInt(hour);
		
		String mins = twentyFourHourTime.substring(colonPosition+1, colonPosition+3);
		int minsInt = Integer.parseInt(mins);
		
		addHour = addHour%24;
		
		System.out.println("addhours: "+addHour);
		
		hoursInt = addHour + hoursInt;
		
		System.out.println("hourInt: "+hoursInt);
		
		//check how many hours the addMins can be converted to and add this to the hoursInt
		hoursInt = hoursInt + (addMins/60);
		
		// add the remainder of the addMins after hours have been removed
		minsInt = minsInt + addMins%60;
		
		
		// if the minsInt goes over 59, add an hour and adjust the mins with the remainder
		if (minsInt>59)
		{
			hoursInt = hoursInt + (minsInt/60);
			minsInt = minsInt%60;
		}
		
		if (hoursInt==24)
		{
			hoursInt = 00;
		}
		
		if (hoursInt>24)
		{
			hoursInt = hoursInt - 24;
		}
		
		hour = "" + hoursInt;
		mins = "" + minsInt;
		
		if (hoursInt<10)
		{
			hour = "0" + hoursInt;
		}
		
		if (minsInt<10)
		{
			mins = "0" + minsInt;
		}
		
		String newTime = hour + ":" + mins;
		System.out.println("new time is " + newTime);
		
		return newTime;
		
	}
}