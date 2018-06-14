import java.util.*;

class Calc
{
	int r1,r2,c1,c2;
	
	void Get(int r1,int r2,int c1,int c2)
	{
		this.r1=r1;
		this.r2=r2;
		this.c1=c1;
		this.c2=c2;
	}
	
	
	void Add(int a[][],int b[][])
	{
		int i,j;
		int c[][]=new int[r1][c1];
		
		if(r1!=r2 || c1!=c2)
			System.out.println("\nN.P");
		else
		{
		System.out.println("\nResult of addition:");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		}
	}
	
	
	void Sub(int a[][],int b[][])
	{
		int m,n;
		int d[][]=new int[r1][c1];
		
		if(r1!=r2 || c1!=c2)
			System.out.println("\nN.P");
		else
		{
		System.out.println("\nResult of subtraction:");
		for(m=0;m<r1;m++)
		{
			for(n=0;n<c1;n++)
			{
				d[m][n]=a[m][n]-b[m][n];
				System.out.print(d[m][n]+"\t");
			}
			System.out.println();
		}
		}
	}
	
	
	void Mult(int a[][],int b[][])
	{
		int q,r,k;
		int e[][]=new int[r1][c2];
		
		if(r2!=c1)
			System.out.println("N.P.");
		else
		{
		System.out.println("\nResult of multiplication:");
		for(q=0;q<r1;q++)
		{
			for(r=0;r<c2;r++)
			{
				e[q][r]=0;
				for(k=0;k<c1;k++)
					e[q][r]=e[q][r]+a[q][k]*b[k][r];
			System.out.print(e[q][r]+"\t");
			}
		System.out.println();
		}
		}
	}
}

class Matrix
{
	public static void main(String args[])
	{
		int k,l,r1,r2,c1,c2;
		Scanner s=new Scanner(System.in);
		
		do{
			System.out.print("\nEnter the rows and columns of the matrix A:");
			r1=s.nextInt();
			c1=s.nextInt();
			
			System.out.print("\nEnter the rows and columns of the Matrix B:");
			r2=s.nextInt();
			c2=s.nextInt();
			
			if(c1==r2)
				break;
		}while(r1!=r2 || c1!=c2);
		
		int a[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		
		System.out.println("\nEnter the elements of A:");
		for(k=0;k<r1;k++)
		{
			for(l=0;l<c1;l++)
				a[k][l]=s.nextInt();
		}
		
		System.out.println("\nEnter the elements of B:");
		for(k=0;k<r2;k++)
		{
			for(l=0;l<c2;l++)
				b[k][l]=s.nextInt();
		}
			
		System.out.println("\nMatrix A:\tMatrix B:");
		for(k=0;k<r1;k++)
		{
			for(l=0;l<c1;l++)
				System.out.print(a[k][l]+"\t");
			for(l=0;l<c2;l++)
				System.out.print(b[k][l]+"\t");
			System.out.println();
		}
		
		
			
		Calc obj=new Calc();
		obj.Get(r1,r2,c1,c2);
		obj.Add(a,b);
		obj.Sub(a,b);
		obj.Mult(a,b);
	}
}


/* 		System.out.print("\nEnter the rows and columns of the first matrix:");
		r1=s.nextInt();;
		c1=s.nextInt();;
		int a[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		
		System.out.println("\nEnter the elements:");
		for(k=0;k<r1;k++){
			for(l=0;l<c1;l++)
				a[k][l]=s.nextInt();}
		
		System.out.println("\nEntered matrix:");
		for(k=0;k<r1;k++){
			for(l=0;l<c1;l++)
				System.out.print(a[k][l]+"\t");
			System.out.println();}
		
		System.out.print("\nEnter the rows and columns of the second matrix:");
		r2=s.nextInt();
		c2=s.nextInt();
		int b[][]=new int[r2][c2];
		
		System.out.println("\nEnter the elements:");
		for(k=0;k<r2;k++){
			for(l=0;l<c2;l++)
				b[k][l]=s.nextInt();}
		
		System.out.println("\nEntered matrix:");
		for(k=0;k<r2;k++){
			for(l=0;l<c2;l++)
				System.out.print(b[k][l]+"\t");
			System.out.println();} */




