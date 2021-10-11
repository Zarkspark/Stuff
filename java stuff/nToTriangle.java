import java.util.Scanner;
import java.lang.String;

class nToTriangle extends delete
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a nth term formula");
		System.out.println("The format can be xn+c or xn where c is 0");
		String formula = in.nextLine();
		int xValue = xValue(formula);
		int cValue = cValue(formula);
		System.out.println(""+xValue+"n + "+cValue);
		printAsterisk(xValue, cValue);
		delete();
	}
	
	public static int xValue(String nthterm){
		// Xn+C or Xn
		int xVal = 0;
		xVal = Integer.parseInt(nthterm.substring(0,nthterm.indexOf("n")));
		return xVal;
	}
	public static int cValue(String nthterm){
		// Xn+C or Xn
		int cVal = 0;
		if (nthterm.indexOf("+") > 0 || nthterm.indexOf("-") > 0){
			System.out.println("The ntherm is of format xn+c");
			cVal = Integer.parseInt(nthterm.substring(nthterm.indexOf("+") + 1));
		} else {
			System.out.println("The ntherm is of format xn");
		}		
		return cVal;
	}
	public static void printAsterisk(int x, int c){
		System.out.println("Setting the value of n to be 5 ");
		for (int c = 0; b < 9; b--){
				System.out.print(" ");
			}
		for (int a = 6; a > 5; a--){
			int nVal = x*a + c;
			for (int b = 0; b < nVal; b--){
				System.out.print("*");
			}
			System.out.println("");
		}
	
	}
}