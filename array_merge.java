import java.util.Scanner;


public class array_merge {
	public static void main(String args[])
	{

		int i;
		int n,m,k;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your lenght for  1st array");
		n= scan.nextInt();
		System.out.println("enter your lenght for  2nd array");
		m=scan.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[m];
		int merge[]=new int[n+m];
		k=n+m;
		System.out.println("enter your element for  1st array");
		for(i=0;i<n;i++)
		{
		 arr1[i]=scan.nextInt();
		}
		System.out.println("enter your element for  2nd array");
		for(i=0;i<m;i++)
		{
		 arr2[i]=scan.nextInt();
		}
		for(k=0;k<n;k++)
		{
			merge[i]=arr1[i]+arr2[i];
		}
		
		System.out.println(merge[i]);
}
}