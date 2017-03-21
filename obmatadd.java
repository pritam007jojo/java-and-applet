import java.io.*;

class Matdemo{

	public static void main(String args[])
	{
		addition ob= new addition(3,3);
		ob.input();
		ob.addmatrix();
		ob.display();
	}

}
class addition{
int r,c;
int arr1[][];
int arr2[][];
int sum[][];
	public addition(int r, int c){
	arr1= new int[r][c];
	arr2=new int[r][c];
	sum=new int[r][c];
	this.r=r;
	this.c=c;
	
	}
	public void input()
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the elements of the 1st array");
		try
		{
		for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
		arr1[i][j]=Integer.parseInt(br.readLine());
		}
		}
		System.out.println("enter the elements of the  2nd array");
		for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
		arr2[i][j]=Integer.parseInt(br.readLine());
		}
		}
		}catch(Exception e){}

	}
	
	public void addmatrix()
	{
	
		for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
		sum[i][j]=arr2[i][j]+arr1[i][j];
		}
		}
	
	}
	public void display()
	{
		System.out.println("the sum of array is");
		
		for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
		System.out.print(sum[i][j]+"\t");
		}
		System.out.println("");
		}
		
		
	}



}