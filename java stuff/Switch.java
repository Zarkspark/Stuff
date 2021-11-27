import java.lang.String;
import java.util.Scanner;

class Switch{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x == 4){
            System.out.println("4");
        }
        else if(x == 1){
            System.out.println("1");
        }
        else if(x == 2){
            System.out.println("2");
        }
    }
}