package solarcalulator;
import java.util.Scanner;
public class Calculator {
	public static int add ( int a, int b)
	{
		return a + b;
	}
	public static int substract ( int a, int b)
	{
		return a - b;
	}
	public static int multiply (int a , int b)
	{
		return a * b;
	}
	public static double divide (double a , double b)
	{
		if (b==0) 
		{ 
			throw new IllegalArgumentException ("Number cannot be divided by Zero");
		}
		else 
			return a/b;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the First number");
		int a= input.nextInt();
		System.out.println("Enter the Second number");
		int b= input.nextInt();
		System.out.println("Addition of Entered First number and Second number is : " +Calculator.add(a,b));
		System.out.println("Substraction of the Entered First and Second Number is : "+Calculator.substract(a,b));
		System.out.println("Multiplication of the Entered First and Second Number is : "+Calculator.multiply(a,b));
		System.out.println("Division of the Entered First and Second Number is : " +Calculator.divide(a,b));
		input.close();
	}
}
