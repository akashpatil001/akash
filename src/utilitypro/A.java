package utilitypro;

public class A
{
  public static void main(String[] args) 
  {
	int a;
	int fact=1;
		System.out.println("enter the number=");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        for(int i=a; i>=1;i--)
        {
        	fact=fact*i;
            
        }
        System.out.println("the factorial="+fact);
        
  }
}
