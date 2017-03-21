import java.util.Scanner;
import java.io.*;


public class primepalindrome implements Runnable {
	int n;
	Thread t1,t2;
	primepalindrome()
	{
		t1 =new Thread(this,"child1");
		t2 =new Thread(this,"child2");
	}
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your number");
		n= scan.nextInt();
		t1.start();
		t2.start();
	}
	public static void main(String[] args) {
		
		primepalindrome ob=new primepalindrome();
		ob.input();
	}
	public void run()
	{
		int c=0,j,b,m,sum=0;
		Thread x=Thread.currentThread();
		if(x==t1)
		{
			
			for(j=2;j<n;j++)
			{
				if(n%j==0)
				{
					c=1;
						
				}
			}
				if(c==0)
					System.out.println("this is prime no:"+n);
				else
					System.out.println("this is not prime no:");
				
		}
		else{
				b=n;
				while(n!=0)
				{
					m=n%10;
					sum= sum*10+m;
					n=n/10;
					
				}
				n=b;
				if(b==sum)
					System.out.println(n+" is a palindrome number");
				else
				System.out.println(n+" is not a palindrome number");
		}
	}

}
