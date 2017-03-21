import java.util.*;




public class Permutation
{
    
	
	public static void main(String args[])
{   
       
 			int n;
        
			Scanner sc=new Scanner(System.in);
       
 			System.out.println("Enter a number between 2 & 5");
     
  			n=sc.nextInt();
       
			int data[]=new int[n];
        
			for(int i=0;i<n;i++)
      
 				 {
             
					data[i]=i+1;   
        
				 }
        
      
 			 System.out.println("The data's are:");
      
  			for(int i=0;i<n;i++)
        
				{
            
					System.out.print(data[i]);
        
				}
    
  			  System.out.println();
        
  
   		   	Permutation ob = new Permutation();
      
 			 ob.permutate(data,0);
  
  				}
    
  
  			void permutate(int[] a, int x) 
   
			 {
        
				int i,j,l;
       
				 l=a.length;
       
				if (x == l) 
       
					{
       
					for (i = 0; i < l; i++) 
      
  						 {
           
						System.out.print("   "+ a[i] + "   ");
       
 						 }
     
  					  System.out.println();
     
  					}
	 
        
        
      else 

       					 {
        
  					 for (j = x; j < a.length; j++) 
         
  						{
            
						 int temp = a[x];
  
        					   a[x] = a[j];
           
				          	   a[j] = temp;
 
            
						   permutate(a, x + 1);
 
           
						   temp = a[x];
             
						   a[x] = a[j];
            
						   a[j] = temp;
             
  						 }
        
					 }
      
			 }
    
	}
