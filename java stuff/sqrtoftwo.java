import java.util.Scanner;
// Imports the scanner
public class sqrtoftwo {
   public static void main(String[] args){
    int num = menu();
    sqrt(num);
    // Calls methods
    }

   public static int menu(){
    Scanner in = new Scanner(System.in);
    // Creates a new scanner
    System.out.println("Ok type in the number you want to square root. (Keep it real)");
    int num = in.nextInt();
    // Asks the user to type the number they want to square root and assigns the value to the num variable
    in.close();
    // Closes the Scanner to avoid resource leaks
    return num;
    // Returns the user's input (The number you want to square root)
   }

   public static double sqrt(int num){
   // Method for square rooting the values the user inputs

    int iterations = 0;
    // This is the number of iterations.
    double x = 0;
    // This is the first number. Default: 0
    double y = num;
    // This is the second number. Default: user input
    double mid = (x+y)/2;
    // This is the middle number or midpoint. 
    for(int i=0; i<=55; i++){
    // for loop with 55 iterations to make the result more accurate
        iterations = iterations + 1;
        System.out.println(iterations);
        // Increments and prints the number of iterations

        double midsq = mid*mid;
        // Squares the middle value and assigns it to the midsq variable

        if(midsq > num){
        // If midsq is larger than the number you want to square root, then set the middle number as the second number, then take the midpoint again.
            y = mid;
            mid = (x+y)/2;
        }
        else if(midsq < num){
        // If midsq is smaller than the number you want to square root, then set the middle number as the first number, then take the midpoint again.
            x = mid;
            mid = (x+y)/2;
            
        }
        System.out.println(mid);
        // Prints the middle number (This is the estimate of the square root)
    }
    return mid;
    // Returns the middle number (The estimate of the square root).
   }
   
}