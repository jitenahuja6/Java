import java.util.*;

class Palindrome
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("\nEnter a string: ");
		String s1=s.nextLine();
		
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		String s2=sb.toString();
		if(s1.equalsIgnoreCase(s2))
			System.out.print(s1+" is a PALINDROME. \n\n");
		else
			System.out.print(s1+" is not a PALINDROME. \n\n");
	}
}