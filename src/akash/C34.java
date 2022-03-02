package akash;

public class C34
{
	public static void main (String[]args)
	{int k=1;
		for(int a=0; a<=3; a++) 
		{
			for(int b=1; b<=6; b++)
			{  
				if (a%2==0) 
			   {   
			    
			    if (b<4) 
				   {   
				    System.out.printf(" * ") ;
				    
				   }
				   else
				   {
					   System.out.printf("  ") ; 
				   } 
			   }
			   else
			   { 
				   if (b>3) 
			       {   
				   System.out.print("   "+k) ; 
				    k++;
				   }
				   else
				   {
					   System.out.printf("  ") ; 
				   } 			 
			   } 													
			}

			System.out.println( );
		}	
			
	}
}
