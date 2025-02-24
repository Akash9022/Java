/*

class MainClass
{
	public static void main(String args[])
	{
		int n=25;
		int sum=0;
		Boolean b=false;
		if(n==0||n==1)
			b=true;
		else
			for(int i=2;i<=n/2;i++)
				if(n%i==0)
				{
					b=true;
					break;

				}
	if(!b)
	{
		int temp=n;
		while(temp!=0)
		{
			sum*=10;
			sum+=temp%10;
			temp/=10;
			
		}
		if(sum==n)
			System.out.println(n+"is the palindromic prime");
		else
			System.out.println("it is not palindromic");
	}
		
	}
}

*/

// homework find the 85th palindromic prime


/*
class MainClass
{
	public static void main(String args[])
	{
		int n=20;
		//int sum=0;
		boolean b=false;
		if(n==0||n==1)
			b=true;
		else
			for(int i=2;i<=n/2;i++)
			
				if(n%i==0)
				{
					b=true;
					break;
				}
			
			if(!b)
			{
				int temp=n, sum=0;
				while(temp!=0)
				{
					sum*=10;
					sum+=temp%10;
					temp/=10;
				
				}
				if(sum==0||sum==1)
					b=true;
				else
					for(int i=2;i<=sum/2;i++)
						if(sum%i==0)
						{
							b=true;
							break;
						}
				if(!b)
					System.out.println(n+" is the prime and twist");

				
			}
			else
				System.out.println(n+" is not prime and twist");
				
				
		
	}
}

*/

/*

import java.util.Arrays;

class MainClass
{
	public static void main(String args[])
	{
		int a[]={18,20,35,19,7,36};
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
		int temp=0;
		i=temp;
		Math.abs(if(temp-a[i])==1)
			System.out.println(a[i]);
		}
		
		
		
		
		System.out.println(Arrays.toString(a));
	}
}

*/


/*
//IMP program
class MainClass
{
	public static void main(String args[])
	{
		int a[]={7,4,1};
		int avg=0;
		int count=0;
		int max;
		for(int i=0;i<a.length;i++)
		{
			
			avg+=a[i];
			count++;
		}
		avg/=count;
		int attempt=0;
		if(avg%1==0)
		{
			for(int i=0;i<a.length;i++)
				if(avg>a[i])
					attempt+=avg-a[i];
		}
		else
				attempt=-1;
			System.out.println(attempt);
			
	}
}

*/

/*
import java.util.Arrays;
class MainClass
{
	public static void main(String args[])
	{
		
		int a[]={123,457,22,6663,157};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			int n=0;
			int temp=0;
			n=a[i];
			while(n!=0)
			{
				temp=n%10;
				if(temp%2!=0)
				b[i]=temp;
				n/=10;
				
			}
						
			
		}
		System.out.println(Arrays.toString(b));
		
			
			
	}

}

*/



/*
class MainClass
{
	public static void main(String args[])
	{	
		int last=0;
		int number=0, count=0;
		while(count<100)
		{
			int original=number;
			int reversed=0;


			while(original>0)
			{
				int digit=original%10;
				reversed=reversed*10+digit;
				original/=10;
				
			}
			if(reversed==number)
			{
				last=number;
				count++;
			}

			number++;	
			
		}
		
		System.out.println("100th palindromic number is: "+last);
		
		
	}
}


*/

			
			


