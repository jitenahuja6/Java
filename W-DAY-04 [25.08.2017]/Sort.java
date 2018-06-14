import java.util.*;

class A{
	void Asec(int a[],int size){
		int j,k,temp;
		for(j=0;j<size;j++){
			for(k=j+1;k<size;k++){
				if(a[j]>a[k]){
					temp=a[j];
					a[j]=a[k];
					a[k]=temp;}}}}
	
	
	void Desc(int a[],int size){
		int j,k,temp;
		for(j=0;j<size;j++){
			for(k=j+1;k<size;k++){
				if(a[j]<a[k]){
					temp=a[j];
					a[j]=a[k];
					a[k]=temp;}}}}
	
	
	void display(int a[],int size){
		int p;
		for(p=0;p<size;p++)
			System.out.println(a[p]);}}

class Sort{
	public static void main(String args[]){
		int i;
		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter the number of elements:");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("\nEnter "+n+" elements:");
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		A obj=new A();
		obj.Asec(a,n);
		System.out.println("\nSorted in ascending order:");
		obj.display(a,n);
		obj.Desc(a,n);
		System.out.println("\nSorted in descending order:");
		obj.display(a,n);}}