import java.io.*;

class Calculate
{
	double p;
	int t;
	float r;
	double si;
	
	void Data(double principal,int time,float rate)
	{
		p=principal;
		t=time;
		r=rate;
	}
	
	void Display()
	{
		System.out.println("\n------YOUR DETAILS--------");
		System.out.println("Principal Amount= "+p);
		System.out.println("Rate= "+r);
		System.out.println("Time= "+t);
		System.out.println("Simple Interest= "+((p*r*t)/100));
	}
}

class Interest
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(i);
		
		System.out.print("\nEnter Principal Amount:");
		double principal=Double.parseDouble(b.readLine());
		
		System.out.print("\nEnter Rate Of Interest:");
		float rate=Float.parseFloat(b.readLine());
		
		System.out.print("\nEnter Time:");
		int time=Integer.parseInt(b.readLine());
		
		Calculate a=new Calculate();
		a.Data(principal,time,rate);
		a.Display();
	}
}