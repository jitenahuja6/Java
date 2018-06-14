class swap
{
	public static void main(String args[])
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.println("BEFORE SWAPPING a= "+a+" b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("AFTER SWAPPING a= "+a+" b= "+b);
	}
}