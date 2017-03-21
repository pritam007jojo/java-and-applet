import java.util.Scanner;


public class transpose {
	public static void main(String args[])
	{
	int i,j,n,m,temp=0;
	Scanner s = new Scanner(System.in);
	System.out.println("enter the size of matrix");
	 m= s.nextInt();
	int arr[][] = new int[m][m];
    System.out.println("enter the element");
	for(i=0;i<m;i++)
	{
		for(j=0;j<m;j++)
		{
	
				arr[i][j] = s.nextInt();
		}
	}
	for(i=0;i<m;i++)
	{
		for(j=i;j<m;j++)
		{
			
				temp= arr[i][j];
				arr[i][j]= arr[j][i];
				arr[j][i]=temp;
		}
	}
	for(i=0;i<m;i++)
	{
		for(j=0;j<m;j++)
		{
	
				System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
	
	}
	
}		
