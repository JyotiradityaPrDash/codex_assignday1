
public class A1p6c 
{

	public static void main(String[] args) 
	{
		int a=2019;
		
		if (a%4==0 && a%100!=0) 
		{
			System.out.println(a+ " is a leap year.");
		}
		
		
		else if (a%400==0) 
		{
			System.out.println(a+ " is a leap year.");
		}	
		
		
		else
		{
			System.out.println(a+ " is not a leap year.");
		}	
			

	}

}
