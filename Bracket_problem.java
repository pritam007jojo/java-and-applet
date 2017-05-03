import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Bracket_problem {
	String[] brackets;
	public static void main( String args[])
	{
		int n,temp=0;
		String s;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your limit of entery");
		n=sc.nextInt();
		brackets = new Strings[n];
		System.out.println("enter your series  of brackets");
		for(int i=0;i<brackets.length;i++)
		{
			brackets[i]=sc.nextLine();
		}
		System.out.println("enter your number to remove a  bracket");
		System.out.println("1 for deleting ( ");
		System.out.println("2 for deleting ) ");
		int m= sc.nextInt();
		if(m==1)
		{
			s="(";
		}
		else
		{
			s=")";
		}
		first: for(int i=0;i<brackets.length;i++)
		{
			if(brackets[i]==s)
			{
				brackets[i]="-";
				temp++;
			}
			else
			{
				break first;
			}
			if(temp>0)
			{
				break;
			}
		}
		Solution();
	}
	void Solution()
	{
		String str1,str2;
		str1="(";
		str2=")";
		int tmp1=0,tmp2=0;
		for(int i=0;i<brackets.length;i++)
		{
			if(brackets[i]==str1)
			{
				tmp1++;
			}
			if(brackets[i]==str2)
			{
				tmp2++;
			}
		}
		if(tmp1==tmp2)
		{
			System.out.println("number of proper brackets are:= "+ tmp1);
		}
		else  if(tmp1>tmp2)
		{			
			System.out.println("number of proper brackets are:= "+  tmp2);
		}
		else{
			System.out.println("number of proper brackets are:= "+  tmp1);
		}
	}
}