package akash;

public class C11 
{
	public static void main (String[]args)
	{
	  // int h=5 ; //global variable
		for (int a=1; a<=6; a++) 
		{int k=a; 		// local variabale
			for (int b=1; b<=5; b++) 
			{
				System.out.printf(" %2d " , k);
				k+=5;
				
			}
			  System.out.println("  " ) ;
			   
		}
		
	}	
}
