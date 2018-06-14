import java.util.*;

class Area
{
	Area(int b,int h)
	{
		System.out.println("\nBase= "+b);
		System.out.println("Height= "+h);
		System.out.println("Area="+(0.5*b*h));
	}
}

class Triangle
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter base and height of triangle:");
		int base=s.nextInt();
		int height=s.nextInt();
		Area a=new Area(base,height);
		
	}
}