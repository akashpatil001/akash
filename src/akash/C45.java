package akash;

public class C45  
{
  public static void main(String[] args) 
    { 
	  for(int a=1; a<=5; a++)
		{
		  int k=a;
		
			for(int b=1; b<=a ;b++) 
			{
				System.out.printf("%2d ",k);
				k+=a;
			}
			System.out.println();
        }
     }
}