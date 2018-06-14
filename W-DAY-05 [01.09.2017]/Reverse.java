import java.util.*;

class Reverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\nEnter a string: ");
		String s=sc.nextLine();
		
		StringBuffer sb= new StringBuffer(s);
		
		
		//s=sb.toString();
		
		System.out.print("\nReversed string: "+sb.reverse());
		
		
		
	}
} 