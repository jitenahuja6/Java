class area
{
	void area(int b, int h)
	{
		float area;
		area=0.5*b*h;
		System.out.println("Area of traingle of base = "+b+" and height = "+h+" is "+area);
	}
}

class tri
{
	public static void main(String args[])
	{
		int b,h;
		b=Integer.parseInt(args[0]);
		h=Integer.parseInt(args[1]);
		area triangle= new area();
		triangle.area(b,h);
	}
}