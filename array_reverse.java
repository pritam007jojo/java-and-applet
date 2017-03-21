import java.util.Scanner;


public class array_reverse {
	public static void main(String args[])
	{
		
	Scanner s=new Scanner(System.in);
	
	int n = s.nextInt();
	int brr[]= new int[n];
	int arr[]=new int[n];
	System.out.println("enter  elements");
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
		brr[n-i-1]= arr[i];
	}
	for(int i=0;i<n;i++)
	{
	System.out.println(brr[i]);
	
	}
	}
	
}