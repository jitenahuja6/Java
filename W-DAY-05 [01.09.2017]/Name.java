import java.util.*;

class Name
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("\nEnter your First Name: ");
		String s1=s.nextLine();
		
		System.out.print("\nEnter your Surname: ");
		String s2=s.nextLine();
		
		StringBuffer sb =new StringBuffer(s1);
		sb.append(" ");
		sb.append(s2);
		String s3=sb.toString();
		
		System.out.print("\nYour Full Name: "+s3);
		
		System.out.print("\n\nEnter your Middle Name: ");
		String s4=s.nextLine();
		
		int i=s1.length();
		sb.insert(i," ");
		sb.insert(i+1,s4);
		
		s3=sb.toString();
		System.out.print("\nYour Full Name: "+s3);
		
		
	}
	
}