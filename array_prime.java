import java.util.Scanner;


public class array_prime {
	public static void main(String args[])
	{
		
	Scanner s=new Scanner(System.in);
	int i,j;
	System.out.println("enter the limit");
	int n = s.nextInt();

	int arr[]=new int[n];
	System.out.println("enter yours elements");
	for(i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	for(i=0;i<n;i++)
	{
		int c=0;
		for(j=2;j<arr[i];j++)
		{
			if(arr[i]%j==0)
			{
				 c=1;
				
			}
		}
		if(c==0)
			System.out.println("this is prime no:"+arr[i]);
		
	}
	
	}
}