import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class array_ascending {
	public static void main(String args[]) throws IOException
	{
	int i,j,n = 0;
	Scanner s = new Scanner(System.in);
	System.out.println("enter the limit");
	 n = s.nextInt();
	int arr[] = new  int[n];
	System.out.println("enter the element");
	for(i=0;i<n;i++)
		{
		 arr[i] = s.nextInt();
		}
		 for(i=0;i<n;i++)
		 {
		for(j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=0;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		 }
		
	for(i=0;i<n;i++)
	{
		System.out.println(arr[i]);
	}
	}
	





}
