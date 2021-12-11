import java.lang.String;
import java.util.Scanner;
import java.lang.Math;
class calculator{
    public static void main(String[] args){
        Scanner main = new Scanner(System.in);
        char op;
        char bsop = menu();
        switch(bsop){
            case 'b':
                System.out.println("Pick an option. a for addition s for subtraction m for multiplication d for division.");
                op = main.next().charAt(0);
                basiccalc(op);
                break;
            case 's':
                System.out.println("Input the first letter of the option. Sin. Cos. Tan. Exponential. Sqrt.");
                op = main.next().charAt(0);
                scicalc(op);
                break;
        }
        main.close();
    }
    public static char menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("Pick an option. b for basic, s for scientific.");
        char bsop = in.next().charAt(0);
        in.close();
        return bsop;
    }
    public static int scicalc(char op){
        Scanner in = new Scanner(System.in);
        double num1;
        double num2;
        double res;
        switch(op){
            case 'S':
                System.out.println("Enter a number.");
                num1 = in.nextInt();
                res = Math.sin(num1);
                System.out.println(res);
                break;
            case 'C':
                System.out.println("Enter a number.");
                num1 = in.nextInt();
                res = Math.cos(num1);
                System.out.println(res);
                break;
            case 'T':
                System.out.println("Enter a number.");
                num1 = in.nextInt();
                res = Math.tan(num1);
                System.out.println(res);
                break;
            case 'e':
                System.out.println("Input 2 numbers.");
                num1 = in.nextInt();
                num2 = in.nextInt();
                res = Math.pow(num1, num2);
                System.out.println(res);
                break;
            case 's':
                System.out.println("Enter a number to sqrt.");
                num1 = in.nextInt();
                res = Math.sqrt(num1);
            default:
                System.out.println("What");
            }
        in.close();
        return 0;

    }
    public static int basiccalc(char op){
        Scanner in = new Scanner(System.in);
        int num1;
        int num2;
        int res;
        switch(op){
            case 'a':
                System.out.println("Input 2 numbers.");
                num1 = in.nextInt();
                num2 = in.nextInt();
                res = num1 + num2;
                System.out.println(res);
                break;
            case 's':
                System.out.println("Input 2 numbers.");
                num1 = in.nextInt();
                num2 = in.nextInt();
                res = num1 - num2;
                System.out.println(res);
                break;
            case 'm':
                System.out.println("Input 2 numbers.");
                num1 = in.nextInt();
                num2 = in.nextInt();
                res = num1 * num2;
                System.out.println(res);
                break;
            case 'd':
                System.out.println("Input 2 numbers.");
                num1 = in.nextInt();
                num2 = in.nextInt();
                res = num1 / num2;
                int rem = num1 % num2;
                System.out.println(res + " Remainder: "  + rem);
                break;
            default:
                System.out.println("What");
                
        }
        in.close();
        return 0;
    }
}