public class Factorial
{
	public static void main(String args[])
	{
		int num = 5, fact=1, i;
		for (i=2; i<=num; i++)
		{	
			fact = fact * i;
		}
		System.out.println("\nFactorial: "+fact);
	}
}