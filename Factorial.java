import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{	
		System.out.println("Enter A Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		//int n=5;
		int factorial=1;
		
		for(int i=1;i<=n;i++)
			
			factorial*=i;
		
		
		System.out.println(factorial);
	}
}