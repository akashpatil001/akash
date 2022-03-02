package akash;

public class C51 
{ 
	public static void main(String[] args) 
    { int k=1;
     
	  for(int a=0; a<=4; a++)
		{
		  int t=k;
			for(int b=0; b<=a ;b++) 
			{
				System.out.printf("%2d ",t);
				t++;
			
			}
			System.out.println();
			k=k+a;
		
        }
     }
}
