class Figure
{
	float Area()
	{
		return 0;
	}
}

class Circle extends Figure
{
		float Area(float r)
		{
			return (3.14f*r*r);
		}
}

class Triangle extends Figure
{
		float Area(float b,float h)
		{
			return (0.5f*b*h);
		}
}

class Rectangle extends Figure
{
		float Area(float l,float b)
		{
			return (l*b);
		}
}

class Square extends Figure
{
		float Area(float l)
		{
			return (l*l);
		}
}

class Areas
{
	public static void main(String args[])
	{
		Circle c= new Circle();
		System.out.println("\nArea of circle with radius 5 is "+c.Area(5));
		
		Triangle t= new Triangle();
		System.out.println("\nArea of triangle with base 6 and height 7 is "+t.Area(6,7));
		
		Rectangle r= new Rectangle();
		System.out.println("\nArea of rectangle with length 8 and breadth 9 is "+r.Area(8,9));
		
		Square s= new Square();
		System.out.println("\nArea of square of side 10 is "+s.Area(10));
	}
}