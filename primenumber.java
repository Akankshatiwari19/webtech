package project1;
import java.util.Scanner;

public class primenumber {

	public static void main(String[] args)
	{

	int c=0;
	Scanner s1 = new Scanner(System.in);
	int x=s1.nextInt();
	for(int i=2;i<x;i++)
	{
		if(x%i==0)
		{
			c++;
		}
	}
	if(c>0)
	{
		System.out.println("The given number is not prime.");
		
	}
	else
	{
		System.out.println("The given number is prime.");
	}


	}}
