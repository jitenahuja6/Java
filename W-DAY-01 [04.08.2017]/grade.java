class grade
{
	public static void main(String args[])
	{
		int n;
		n=Integer.parseInt(args[0]);
		if(n<=40)
			System.out.println("FAIL");
		else if(n>=41 && n<=50)
			System.out.println("AVERAGE");
		else if(n>=51 && n<=60)
			System.out.println("FAIR");
		else if(n>=61 && n<=70)
			System.out.println("GOOD");
		else if(n>=71 && n<=80)
			System.out.println("VERY GOOD");
		else if(n>=81 && n<=90)
			System.out.println("EXCELLENT");
		else
			System.out.println("OUTSTANDING");
		
	}
}