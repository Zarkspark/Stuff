import java.lang.String;
import java.util.Scanner;
import java.util.Random;

class Project{
    public static int generate(){
        Random random = new Random();
        int num = random.nextInt(101);
        return num;
    }

    public static void main(String[]args){
        boolean retry = true;
        Scanner in = new Scanner(System.in);
        int rand = generate();
        while(retry==true){
            System.out.println("Guess my number from 0 - 100 ");
            int guess = in.nextInt();
            System.out.println(rand);
            if(guess == rand){
                System.out.println("Congratulations, you guessed correctly!");
                System.out.println("Would you like to play again? ");
                String choice = in.nextLine();
                System.out.println(choice);
            }
        }
        in.close();
        System.out.println("Goodbye");
    }
}