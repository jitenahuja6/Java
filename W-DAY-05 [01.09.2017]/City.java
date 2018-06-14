import java.util.*;

class Order
{
	void citySort(String s1[],int n)
	{
		for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					int x=s1[i].compareToIgnoreCase(s1[j]);
					if (x>0)
					{
						String temp=s1[i];
						s1[i]=s1[j];
						s1[j]=temp;
					}
				}
			}
		
		System.out.print("\nCities in Alphabetically ordered form: \n");
		for(int i=0;i<n;i++)
			System.out.print("City "+(i+1)+": "+s1[i]+"\n");
	}
}	
	
class City
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("\nEnter the number of cities: ");
		int n=s.nextInt();
		
		System.out.print("\nEnter "+n+" cities:\n");
		String s1[]=new String[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.print("\nCity "+(i+1)+": ");
			s1[i]=s.next();
			
		}
		
		Order obj=new Order();
		obj.citySort(s1,n);
	}
	
}

//StringBuffer sb=new StringBuffer(s1
		//if(sb.charAt(i)>sb.charAt(j))
				//{
				//	sb.insert(i,sb.charAt(j));
				//	sb.delete(j+1,j+2);
				//}

/* System.out.print("\nEntered cities: ");
		for(int i=0;i<n;i++)
		{
			System.out.print("\nCity "+(i+1)+": "+s1[i]);
			
			System.out.println();
		} */