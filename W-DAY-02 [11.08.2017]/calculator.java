import java.io.*;

class calc
{
	int a,b,res;
		
	void Get(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	
	void add()
	{
		res=a+b;	
		System.out.println("Result of "+a+"+"+b+" = "+res);
	}
	
	void sub()
	{
		res=a-b;	
		System.out.println("Result of "+a+"-"+b+" = "+res);
	}
	
	void mul()
	{
		res=a*b;	
		System.out.println("Result of "+a+"*"+b+" = "+res);
	}
	
	void div()
	{
		res=a/b;	
		System.out.println("Result of "+a+"/"+b+" = "+res);
	}
}


class calculator
{
	public static void main(String args[]) throws IOException
	{
		
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader c= new BufferedReader(i);
		
		System.out.print("\nEnter a: ");
		int a=Integer.parseInt(c.readLine());
		
		System.out.print("\nEnter b: ");
		int b=Integer.parseInt(c.readLine());
		
		System.out.print("\nEnter the operation: ");
		char ch=c.readLine().charAt(0);
		
		calc ref=new calc();
		
		ref.Get(a,b);
		switch(ch){
			case '+': 	ref.add();
						break;
			
			case '-': 	ref.sub();
						break;
						
			case 'x': 	ref.mul();
						break;
			
			case '/': 	ref.div();
						break;
			
			default: System.out.println("WRONG CHOICE");
 			
		}
	}
		
}