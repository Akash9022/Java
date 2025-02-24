
/*

public class Child
{
	public int a,b;
	static int x=10,y=20;

 	void add()
	{
		System.out.println(a+b);	// no argument no return type method
	}

	
	int display()
	{
		System.out.println(a*b);    	// no argument with return type
		return 0;
		
	}

	int display(int a, int b)
	{
		System.out.println(a-b);	// argument with return type 
		return a-b;
	}

	void calculate()
	{
		System.out.println((a+b)/2);	// with argument no return type
	}


	static void calc()
	{
		System.out.println((x+y)/2);	// once you declare a method as a static then you do not acess
						//  other class members like variables and values, olny acess static members and method 						// declare time you passing them as a parameter
	} 




}

*/



/*

// WAP to find the avg of two number

class Child
{
	int a,b;
	int average()
	{
		int average=(a+b)/2;
		System.out.println(average);
		return average;
	}

	
}

*/

/*
// WAP to find max number in given number(12345)

class Child
{
	int number=12345;
	int maxnumber=0;
	
	void Maxnumber(){
	 
	while(number>0)
	{
		int digit = number%10;
		if(digit > maxnumber)
		{
			maxnumber=digit; 
		}
		number/=10;
				
	}
	
	System.out.println("max number is="+maxnumber);
	}
}

*/


// WAP to find second largest number

class Child
{
	int number=10020;
	int maxnumber=0;
	int secondmaxnumber=0;
	void Secondmaxnumber()
	{
		while(number>0)
		{
			int digit=number%10;
			if(digit>maxnumber)
			{
				maxnumber=digit;
			}
			
			else if(digit>secondmaxnumber && digit!=maxnumber){
				secondmaxnumber=digit;
			}
			number/=10;
		}
		System.out.println(secondmaxnumber);
	}
}

			



	







