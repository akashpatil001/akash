package akash;

public class A 
{
  public static void main(String[]args)
  {
	  int a=2;
	  while(a<8)
	  {
		  if(a%2==0)
		  {	  
		    for(int s=4;s<11;s++)
		     {
			
 		        for(int d=1; d<4;d++)
		          {
			        System.out.print("A");
		          }
 		        System.out.print("   ");
		 
		     }   
	        System.out.println("   ");
	        ++a;
		  }
		  else
		  {
			  for(int s=4;s<11;s++)
			     {
				
	 		        for(int d=1; d<4;d++)
			          {
				        System.out.print("B");
			          }
	 		        System.out.print("   ");
			 
			     }   
		        System.out.println("   ");
		        ++a;
		  }
	  }
  }
}
