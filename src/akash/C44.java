package akash;

public class C44
{
public static void main(String[] args) 
{int k=0;
	for(int a=1; a<=4; a++)
	{
		k+=a;
	
		for(int b=k; b>k-a ;b--) 
		{
			System.out.printf(" %2d ",b);
			
		}
		System.out.println();
		
	}
}
}


//a    1  2  3  4

//k    0  1  3  6
//b    1  3  6  10