import java.io.*;
import java.lang.*;

class Stack{
int arr[];
int size;
int top;
Stack(int s){
	size=s;
	top=-1;
	arr= new int[size];
}
public void push(int item)
{
	if(top==size-1)
	{
		System.out.println("stack overflowed");
		
	}
	else
	{
		arr[++top]=item;
	}
	
}
public int pop()
{
	int s;
	if(top<0)
	{
		System.out.println("stack underflow");
		return -999;
	}
	else {
		s=arr[top--];
		return s;
	}
}
public void display()
{
	for(int i=top;i>=0;i--)
		System.out.print(arr[i]+" ");
	System.out.println();
	
}
}
class DataStructure extends Stack
{
	int ch;  
	int c=0;
public DataStructure(int s)
	{
	 super(s);
	 ch=1;
	}
	

public void menu() throws IOException
{
while(ch>=1&&ch<5)
	{
	System.out.println("1.push");
	System.out.println("2.pop");
	System.out.println("3.display");
	System.out.println("4.exit");
	
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	ch=Integer.parseInt(br.readLine());
	System.out.println();
	switch(ch)		{
		case 1:
		System.out.println("enter elemnets to pushed");
		int n= Integer.parseInt(br.readLine());
		push(n);
		break;
		case 2:
		c=pop();
		System.out.println(c);
		break;
		case 3:
		display();
		break;
		case 4:
		System.exit(0);
		break;
		default:
		System.out.println("you entered an invalid choice");
		
		}
	}

}
}
	
class  Mystack
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the limit of your stack");
		int s= Integer.parseInt(br.readLine());
		DataStructure obj= new DataStructure(s);
		obj.menu();
	}

}
