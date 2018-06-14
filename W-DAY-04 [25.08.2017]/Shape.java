import java.util.*;

class Calculate
{
	void Calc(float r)
	{
		System.out.println("Volume of sphere="+(4*3.14*r*r*r)/3);
	}
	
	void Calc(float r,float h)
	{
		System.out.println("Volume of cone="+(3.14*r*r*h)/3);
	}
	
	void Calc(float l,float b,float h)
	{
		System.out.println("Volume of box="+(l*b*h));
	}
	
}

class Shape
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("\n1.Find  volume of sphere.");
		System.out.println("2.Find  volume of cone.");
		System.out.println("3.Find  volume of box.");
		System.out.println("Enter your choice:");
		char ch=s.next().charAt(0);
		Calculate a=new Calculate(); 
		switch(ch)
		{
			case '1':	System.out.print("\nEnter the radius:");
						float rad=s.nextFloat();
						a.Calc(rad);
						break;
			
			case '2':	System.out.print("\nEnter the radius:");
						float radius=s.nextFloat();
						System.out.print("\nEnter the height:");
						float ht=s.nextFloat();
						
						a.Calc(radius,ht);
						break;
						
			case '3':	System.out.print("\nEnter the length:");
						float length=s.nextFloat();
						System.out.print("\nEnter the breadth:");
						float breadth=s.nextFloat();
						System.out.print("\nEnter the height:");
						float height=s.nextFloat();
						a.Calc(length,breadth,height);
						break;			
			
		}
	}
}