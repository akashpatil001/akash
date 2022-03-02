package akash;

public class C14 
{
	public static void main (String[]args)
	{
		int x;
		int y;
		for (int a=1 ; a<=5 ;a++)
		{   
			x=a;
			y=5-a+1;
			
			for (int b=1; b<=5 ;b++)
			{
				if (b%2==1)
				{
				 System.out.printf(" %2d",y);				
				}
				
				else 
				{
				 System.out.printf(" %2d",x);						
			    } 
				x=x+5;
				 y=y+5;
			}
			 
			System.out.println( );
		}
		
	}
}
