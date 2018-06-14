import java.util.*;

class Fact
{
	static long Calc(int n)
	{
		if(n==0)
			return 1;
		else
			return(n*Calc(n-1));
	}
}

class Factorial
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter n:");
		int n=s.nextInt();
		Fact a=new Fact();
		System.out.print("\nFactorial of "+n+" is "+a.Calc(n));
	}
}