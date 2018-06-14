class patstar
{
	public static void  main(String args[])
	{
		int n;
		n=Integer.parseInt(args[0]);
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print("* ");
			System.out.println ();
		}
	}
}