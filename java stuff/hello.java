import java.util.Scanner;
import java.lang.String;

class hello extends delete
{
    public static void main(String[] args){
        System.out.println("You will now be asked to enter 2 numbers.");
        System.out.println("Enter your first number ");
        Scanner in = new Scanner(System.in);
        int Num1 = in.nextInt();
        System.out.println("Now enter your second number ");
        int Num2 = in.nextInt();

        System.out.println("I will now add these 2 numbers.");
        int calc = Num1 + Num2;
        System.out.println("The answer is " + calc);
        
        System.out.println("Made by zarkspark.");
        delete();
    }

}

