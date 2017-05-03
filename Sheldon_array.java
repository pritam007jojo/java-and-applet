import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Sheldon_array {
     static int a=0,b=0,r=0,j=0,temp1=0,temp2=0;
    public static void main(String args[] ) throws Exception {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number of numbers");
        int n = s.nextInt();
        int arr[] =new int[n];
        int temp[] =new int[n+1];
        temp[0]=-1;
		System.out.println("Enter numbers into array");
        for (int i = 0; i < n; i++) {
            arr[i] =s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            j=0;
            
            if(i>=1)
            {
                j=i;
                while(j>0)
                {
                j--;
                a=arr[j];
                b=arr[i];
                    if((j+1)==i)
                    {
                      temp1=gcd();  
                    }
                    else{
                      temp2=gcd();
                      max();
                    }
                    temp[i+1]=temp1;
                }
            }
            else{
            a=arr[i];
            b=arr[1+i];
            temp[i+1]=gcd();
            }
        }
     for(int i=0;i<n;i++)
     System.out.println(temp[i]);

        
    }
   public static int gcd()
    {
         
         while(a!=0)
        {
            r=b%a;
            b=a;
            a=r;
            
        }
		return b;
    }
    public static void max()
    {
        if(temp2>temp1)
        {
            temp1=temp2;
        }
        
    }
}
