package project1;
import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args)
	{
   int factorial = 1;
	Scanner s1 = new Scanner(System.in);
	int x=s1.nextInt();
	for(int i=x;i>=1;i--)
	{
		factorial = factorial*i;
	}
	System.out.println("Factorial of the given number is " +factorial);
	}

}
