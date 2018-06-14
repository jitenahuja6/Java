class calculatornormal
{
	public static void main(String args[])
	{
		int a,b,res;
		char ch;
		a=Integer.parseInt(args[0]);
		ch=args[1].charAt(0);
		b=Integer.parseInt(args[2]);
		
		switch(ch)
	{
		case '+': 	res=a+b;	
					System.out.println("Result of "+a+"+"+b+" = "+res);
					break;
			
		case '-': 	res=a-b;	
					System.out.println("Result of "+a+"-"+b+" = "+res);
					break;
						
		case 'x': 	res=a*b;	
					System.out.println("Result of "+a+" * "+b+" = "+res);
					break;
			
		case '/': 	res=a/b;	
					System.out.println("Result of "+a+"/"+b+" = "+res);
					break;
		
		default: System.out.println("WRONG CHOICE");
	
	}
		
		
	}
}