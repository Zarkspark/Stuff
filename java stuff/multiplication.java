import java.util.Scanner;
import java.lang.String;

public class multiplication extends delete
{
    public static void main(String[] args){
        multiply();
        delete();
    }

    public static int multiply(){
        System.out.println("Enter 2 numbers." );
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int calc = n1 * n2;
        System.out.println("The answer is " + calc);
        return calc;


    }
}
