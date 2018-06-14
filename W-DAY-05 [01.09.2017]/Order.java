import java.util.*;

class Order
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("\nEnter a string: ");
		String s1=s.nextLine();
		
		StringBuffer sb=new StringBuffer(s1);
		
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if(sb.charAt(i)>sb.charAt(j))
				{
					sb.insert(i,sb.charAt(j));
					sb.delete(j+1,j+2);
				}
					
			}
		}
		
		System.out.print("\nAlphabetically ordered string is: "+sb);
		
	}
}