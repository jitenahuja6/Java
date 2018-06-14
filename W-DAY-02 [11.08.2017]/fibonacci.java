class calc
{
		void fibo(int n,int a,int b){
		int i,c=0;
		System.out.println("Fibonacci series till "+n+" is:");
		for(i=1;i<=n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(" "+c+" ");
		}}
		
}

class fibonacci
{
	public static void main(String args[])
	{
		int n,a=1,b=1;
		n=Integer.parseInt(args[0]);
		calc obj=new calc();
		obj.fibo(n,a,b);
	}
}