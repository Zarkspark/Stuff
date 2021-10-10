import java.util.Scanner;
import java.lang.String;

class NewTime {
    /*
    * The code first imports "Scanner" and "String"
    * It creates a new class "NewTime"
    * It creates a new int method called "getChoice1" which gets an input from the user
    * Choice 1 to convert 24Hr time to 12Hr time
    * Choice 2 to convert 12Hr time to 24Hr time
    * User will be prompted until they enter the right choice
    */
    public static int getChoice1(){
        Scanner inputScanner = new Scanner(System.in);
        int userInput = 0;
        System.out.println("Enter time to convert  ");
        System.out.println("Choice 1 for 24Hr->12Hr");
        System.out.println("Choice 2 for 12Hr->24Hr");
        while (userInput != 1 && userInput != 2){
            System.out.print("Enter your choice: ");
            userInput = inputScanner.nextInt();
            if (userInput !=1 && userInput !=2 ){
                System.out.println("Invalid Input - Please enter 1 or 2");
            }
        }
        System.out.println("You have entered the choice: " + userInput);
        inputScanner.close();
        return userInput;
    }

    public static int getChoice2(){
        Scanner userInput = new Scanner(System.in);
        int time = 00;
        System.out.println("Please enter a time with am/pm and a colon");
        time = userInput.nextInt();
        
        userInput.close();
        return time;
    }


    public static void main(String[] args) {
        getChoice1();
    }
}