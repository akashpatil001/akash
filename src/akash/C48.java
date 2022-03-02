package akash;

public class C48 
{
 public static void main(String[] args)
 {int k=1;
  int j=5;
	 
		for(int a=5; a>=1; a--)
		{
			 
		int t=k;
		int x=a;
			for(int b=5; b>=a ;b--) 
			{
				System.out.printf(" %2d ",t);
				t= t-x;
					x++;	
			}
			System.out.println();
			k=k+j;
			j--;
         }
		
 }
}