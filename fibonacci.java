import java.io.*;
import java.util.Scanner;

public class fibonacci {
		
		public static void main(String args[])
		{
			int i;
			Scanner scan=new Scanner(System.in);
			System.out.println("enter your lenght");
			int n= scan.nextInt();
			int arr[]=new int[n];
			arr[0]=0;
			arr[1]=1;
			for(i=2;i<n;i++)
			{
				arr[i]=arr[i-1]+arr[i-2];
			}
			for(i=0;i<n;i++)
			{
			System.out.println(arr[i]);
			}
		}
		

}