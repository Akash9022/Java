

//import java.util.Arrays;

/*

// WAP program to shift first element to last and last to first Using third variable

class MainClass
{
	public static void main(String args[])
	{
		int a[]={20,30,40,50,60};
		int temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
		
		
		System.out.println(Arrays.toString(a));
	}
}
		
*/



// WAP program to shift first element to last and last to first without using third vriable

/*
class MainClass
{
	public static void main	


*/


/*
// WAP to merge two array

class MainClass
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		int b[]={70,80,5,112,120,130,150};
		int c[]= new int[a.length+b.length];
		//System.arraycopy(a,0,c,0,a.length);
		//System.arraycopy(b,0,c,a.length,b.length);
		for(int i=0;i<a.length;i++)
		{
			
		}
		System.out.println(Arrays.toString(c));
	}
}

*/


/*

 class MainClass {
    public static void main(String[] args) {
        // Input array
        int[] inputArray = {123, 524, 658, 147};
        
        // Output array to store the sums
        int[] outputArray = new int[inputArray.length];
        
        // Loop through each element in the input array
        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = sumOfDigits(inputArray[i]);
        }
        
        // Print the output array
        System.out.print("Output array: {");
        for (int i = 0; i < outputArray.length; i++) {
            System.out.print(outputArray[i]);
            if (i < outputArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
    
    // Method to calculate the sum of digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; // Add the last digit to the sum
            number /= 10;      // Remove the last digit
        }
        return sum;
    }
}

*/



/*
// WAP to addition of every element append to the end of element

class MainClass
{
	public static void main(String args[])
	{
		int a[]={123,456,789,147,852,963};

		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			int sum =0;
			while(temp!=0)
			{
				sum+=temp%10;
				temp/=10;
			}
			if(sum<10)
				a[i]*=10;
			else
				a[i]*=100;
			a[i]+=sum;
			
		
		}
		System.out.println(Arrays.toString(a));	
	}
}


*/


/*
class MainClass
{
	public static void main(String args[])
	{
		int a[]={123,145,523,25,6545};
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			int last=temp%10;
			temp/=10;
			while(temp!=0)
			{
				last*=10;
				temp/=10;				
			}
			last+=a[i]/10;
			a[i]=last;
		}
		System.out.println(Arrays.toString(a));
	}
}


*/


/*
class MainClass
{
	public static void main(String args[])
	{
		int a[]={12,25,20,30,17,15,24};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%6==0)
				if(a[i]%4==0)
					a[i]=-3;
				else
					a[i]=-1;
			else
				if(a[i]%4==0)
					a[i]=-2;				
		}
		System.out.println(Arrays.toString(a));
	}
}
	

*/


/*
class MainClass
{
	public static void main(String args[])
	{
		int a[]={12,15,78,32,10,5};
		int b[]=new int[a.length-1];
		for(int i=0;i<a.length-1;i++)
		{
			int diff=a[i]-a[i+1];
			b[i]=Math.abs(diff); // Math.abs can convert negative no into positive because diff can be in negative also
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
		int a[]={5,18,15,20,22,35,23,12,13,30};
		int key=50;
		for(int i=0;i<a.length-1;i++)
			for(int j=i+1;j<a.length;j++)
				if(key==a[i]+a[j])
					System.out.println(a[i]+"\t"+a[j]);
				
		
		
		
	}
}


*/



/*
class MainClass
{
	public static void main(String args[])
	{
		for(int i=0;i<=1000;i++)
		{
			int sum=0;
			int count=0;
			int n=i;
			int temp=n;
			while(temp!=0)
			{
				sum*=10;
				sum+=temp%10;
				temp/=10;
				
				
			}
			if(sum==n)
			count++;
			count=n;
			System.out.println(n);
			
			
		}
		
	}
}

*/


/*
// WAP to print first 58th palindrome number and display it reverse
class MainClass
{
	public static void main(String args[])
	{
		int first=0; 
		int last=58;
		int a=0;
		int b[]= new int[last];
		
		while(true)
		{
			int temp=a,sum=0;
			while(temp!=0)
			{
				sum*=10;
				sum+=temp%10;
				temp/=10;
				
			}
			if(sum==a)
				b[b.length-1-first++]=a;
				
			if(first==last)
				break;
			a++;
			
		}
		System.out.println(Arrays.toString(b));
	}
}

*/


/*
class MainClass
{
	public static void main(string args[])
	{
		int sum=0, a=145, temp=a;
		while(temp!=0)
		{
			int fact=1;
			for(int i=2;i<=temp%10;i++)
			sum*=10;
			sum+=temp%10;
			
		}
	}
}
	

*/



/*
import java.lang.Math;
class MainClass
{
	public static void main(String args[])
	{
		int a=145,temp=a,length=0;
		int sum=0;
		while(temp!=0)
		{
			length++;
			temp/=10;
			
		}
		temp=a;	
		while(temp!=0)
		{
					
			sum+=Math.pow(temp%10,length);	
			temp/=10;
		}
		if(sum==a)
			System.out.println(a+" is armstrong number");
		else
			System.out.println(a+" is not armstrong number");
	}
}

*/

/*
import java.util.Arrays;
class MainClass
{
	public static void main(String args[])
	{
		Object a[]={10,10.20,'A',5,10.20f};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}	
		//System.out.println(Arrays.toString(a));
	}
}

*/


/*
// WAP to sort number
class MainClass
{
	public static void main(String args[])
	{
	 	int n=2398572;//2235789
		int temp=0;
		int a=n;
		while(a!=0)
		{
			
			a=n%10;
			n/=10;
			a=temp;
			if(a>temp)
			{
				a=temp;
			}			
		}
		System.out.println(temp);
		
	}
}

*/

/*
class MainClass
{
	public static void main(String args[])
	{
		int sum=0; //first=100, last=200;
		for(int i=100;i<=200;i++)
		//while(first<=last)
		{
			int rev=0;
			int temp=i;
			//int n=i;
			while(temp!=0)	
			{
				rev*=10;
				rev+=temp%10;
				temp/=10;
				
			}
			if(rev==i)
				sum+=rev;
			//first++;
			
		}
		System.out.println(sum);
		
			
	}
}

*/

import java.util.Arrays;
class MainClass
{
	public static void main(String args[])
	{
		int a[]={10,23,58,20,25,555,1000,3645};
		for(int i=0;i<a.length/2;i++)
		{
			int temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
			
	
		}
		
		System.out.println(Arrays.toString(a));
	}
}

			

			
		
			
		

		
