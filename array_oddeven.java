import java.util.Scanner;


public class array_oddeven {


	public static void main(String[] args) {
		int i,c=0,d=0,k=0,l=0;
		int flag=0;
		int arr[] = {1,2,3,4,5,6,12,14,10,11};
		for(i=0;i<10;i++)
		{
			if(arr[i]%2==0)
			{
				c=c+arr[i];
				k++;
			}
			else
			{
			d=d+arr[i];
			l++;
			
			}
		}
		double av1=(double)c/k;
		double av2=(double)d/l;
		System.out.println("Average of Even "+av1);
		System.out.println("Average of Even "+av2);
	}

}
