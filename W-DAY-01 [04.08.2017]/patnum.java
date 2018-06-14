class patnum
{
	public static void main(String args[])
	{
		int n;
		n=Integer.parseInt(args[0]);
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
				System.out.print(" ");
			for(int k=i;k<=n;k++)
				System.out.print(k+" ");
			System.out.println();
		}
	}
}