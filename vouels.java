import java.io.*;
public class vouels {

public static void main(String args[])throws IOException
	{
	int i,c=0;
	String str1;
	char str2 =0;
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	str1 = br.readLine();
	for(i=0;i<str1.length();i++)
	{
		str2= str1.charAt(i);
	
	if(str2=='A'||str2=='a'||str2=='e'||str2=='E'||str2=='I'||str2=='i'||str2=='o'||str2=='O'||str2=='u'||str2=='U')
	{
		c++;
	}
	if(str1=="\t")
	{
		System.out.println(str1+"\n");
		
	}
	else
	{
		System.out.println(str1);
	}
	}
	System.out.println("no of vouels are :"+c);
	
	}
}