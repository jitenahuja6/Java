import java.io.*;

class Input
{
	String name;
	char gender;
	int age;
	double salary;
	
	void get_Details(String name,char gender,int age,double salary)
	{
			this.name=name;
			this.gender=gender;
			this.age=age;
			this.salary=salary;
			
	}
	
	void Display()
	{
		System.out.println("\n--------DETAILS-------------");
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		
	}
}

class Details
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(i);
		
		System.out.print("\nEnter Name:");
		String name=b.readLine();
		
		System.out.print("\nEnter Gender:");
		char gender=b.readLine().charAt(0);
		
		System.out.print("\nEnter Age:");
		int age=Integer.parseInt(b.readLine());
		
		System.out.print("\nEnter Salary:");
		double salary=Double.parseDouble(b.readLine());
		
		Input a=new Input();
		a.get_Details(name,gender,age,salary);
		a.Display();
	}
	
}