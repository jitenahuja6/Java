class cube
{
	public static void main(String args[])
	{
		int n,i;
		n=Integer.parseInt(args[0]);
		System.out.println("Cube of all numbers from 1 to "+n+" is:");
		for(i=1;i<=n;i++)
		{
			System.out.println(i+"^3= "+i*i*i);
			
		}
	}
	
}