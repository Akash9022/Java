// Practice for Pattern


/*

print, 

1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5

*/




/*
class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)// dry run i=6 6<=5
		{
			for(int j=1;j<=n;j++)// dry run j=6 6<=5 
			{
				System.out.print(i);
			}
		System.out.println();
		}
	}	
}


*/


/*

Print,
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5

*/


/*
class Pattern
{
	public static void main(String args[])
	{
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(j);
			}
		System.out.println();
		}
	}
}


*/



/*

Print,
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1

*/


/*
class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print(j);
			
			}
			System.out.println();
		}
	}
}

*/



/*

// floyd traingle
Print,
5  4  3  2  1
9  8  7  6
12 11 10
14 13
15

*/


/*
class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		int count=n;
		for(int i=n;i>=1;i--)
		{
			int C=count;
			for(int j=i;j>=1;j--)
			{
				System.out.print(C+"\t");
				C--;
					
			}
			
		System.out.println();
		count+=i-1;
		}
	}
}	

*/

/*
Print 
1 2 3 4 5 
6 7 8 9
10 11 12 
13 14 
15
*/



/*
class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(count+"\t");
				count++;
				
			}
		System.out.println();
		
		}
	}
}

*/



/*
Print
11 12 13 14 15
7   8  9 10   
4   5  6  
2   3
1    

*/

/*
class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		int count=((n*(n-1))/2)+1;
		for(int i=n;i>=1;i--)
		{
			int c=count;
			for(int j=i;j>=1;j--)
			{
				System.out.print(c+"\t");
				c++;

			}
		System.out.println();
		count-=i-1;	

		}
	}
}


*/


/*
Print,
       1 1 1 1 1
       2 2 2 2 2
       3 3 3 3 3
       4 4 4 4 4
       5 5 5 5 5




class Pattern
{
public static void main(String args[])
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
	
		for(int j=1;j<=5;j++)
		{
			System.out.print(i);
		}
	System.out.println();

	
	}
}

}

*/


/*

Print,

5 5 5 5 5
4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1




class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(i);
			}
		System.out.println();
		}
	}
}


*/


/*
Print,

1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5



class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j);
			}
		System.out.println();
		}
	}
}

*/



/*

Print,

5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1



class Patter
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print(j);
			}
		System.out.println();
		}
	}
}

*/


/*
Print,

A A A A A 
B B B B B
C C C C C 
D D D D D
E E E E E



class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(i+64));
			}
		System.out.println();
		}
	}
}

*/

/*
Print,
A B C D E
A B C D E 
A B C D E
A B C D E 
A B C D E 


class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(j+64));
			}
		System.out.println();
		}
	}
}
*/


/*
Print,
E E E E E 
D D D D D 
C C C C C 
B B B B B 
A A A A A 



class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(i+64));
			}
		System.out.println();
		}
	}
}

*/

/*

Print,
E D C B A 
E D C B A 
E D C B A
E D C B A
E D C B A



class Pattern
{
	public static void main(String args[])
	{
		
		int n=5;
		for(int i=1;i<=n;i++)
		{	
			for(int j=n;j>=1;j--)
			{
				System.out.print((char)(j+96));
			}
		System.out.println();
		}
	}
}

*/




/*

Print,
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *



class Pattern
{
	public static void main(String args[])
	{
		
		int n=5;
		for(int i=1;i<=n;i++)
		{	
			for(int j=n;j>=1;j--)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
}

*/



// Traingle

/*

Print,
*
** 
***
****
*****


class Pattern
{
	public static void main(String args[])
	{
		int n=5;

		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{	

				System.out.print("*");
			
			}
		System.out.println();
		}
	}
}

*/


/*

Print,
*****
****
***
**
*




class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
				System.out.print("\t");
			}
		System.out.println();
		}
	}
}

*/



/*
Print,
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5



class Pattern
{
	public static void main(String args[])
	{	
		int n=5;
		int c=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
	
                       	
				System.out.print((char)(j+96));
				c++;
		System.out.println();
		}
	}
}

*/


/*

Print
Aa  Bb  Cc  Dd  Ee
Aa  Bb  Cc  Dd  Ee
Aa  Bb  Cc  Dd  Ee
Aa  Bb  Cc  Dd  Ee
Aa  Bb  Cc  Dd  Ee


class Pattern
{
	public static void main(String args[])
	{
		int  n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(j+64));
				System.out.print((char)(j+96));
			}
		System.out.println();
		}
	}
}

*/


/*
Print,
15 14 13 12 11
10 9  8  7
6  5  4
3  2
1




class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		int count=(n*(n+1))/2;
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=i;j<=n;j++)
			{
				System.out.print(count+"\t");
				count--;
				
			}
		System.out.println();
		
		}
	}
}

*/

/*
Print,
1
2  3
4  5  6
7  8  9  10
11 12 13 14 15



class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(count);
				System.out.print((char)(count+64));
				System.out.print("\t");
				count++;
			}
		System.out.println();
		}
	}
} 

*/


/*
Print,

11 12 13 14 15
7  8  9  10
4  5  6
2  3  
1



 class Pattern {
    public static void main(String[] args) {
        int number = 1; // Start the pattern with 1
        int totalRows = 5;

        // Calculate the starting number for the last row
        for (int i = 1; i <= totalRows; i++) {
            number += i;
        }
        number--; // Adjust because the loop adds one extra

        // Print the pattern
        for (int row = totalRows; row >= 1; row--) {
            int start = number - row + 1; // Calculate the starting number for the row
            for (int col = start; col <= number; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
            number = start - 1; // Update the number for the next row
        }
    }
}


*/

/*
Print,

            15
        13  14 
     10 11  12
  6   7  8   9
1 2   3  4   5   



class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		int count=((n*(n+1))/2);
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=i;j<n;j++)
			{
				System.out.print("\t");
			}	

			for(int j=i;j>=1;j--)
			{
				System.out.print(c+"\t");
				c++;
				
			}
		System.out.println();
		count-=i+1;
		
		}
	}
}


*/


/*
print the bigger number using turnary operator among 4 number


class Pattern
{
	public static void main(String args[])
	{
		int a=80,b=550,c=90,d=2000;
		String result=	(a>b)?
				((a>c)?
				((a>d)?"a is bigger":"d is bigger")
				:((c>d)?"c is bigger":"d is bigger"))
				:((b>c)?
				((b>d)?"b is bigger":"d is bigger")
				:((c>d)?"c is bigger":"d is bigger"));
				
				System.out.println(result);
	}
}

*/

/*
print the bigger number using turnary operator among 5 number 

class Pattern
{
	public static void main(String args[])
	{
		int a=10, b=20, c=30, d=40, e=50;
		String result=	((a>b)?(a>c)?(a>d)?(a>e)?"a is bigger" : "e is bigger" : (b>c)?(b>d)?(b>e)?"b is bigger" : "e is bigger" : (c>d)?(c>e)?"c is bigger" : "e is bigger" : (d>e)?"d is bigger" : "e is bigger");
				System.out.println(result);
	}
}

*/


/*

class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
			}
		System.out.println();
		}

		for(int i=n-1;i>=1;i--)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
*/



/*

Print,


        *
       **
      ***
     ****
    *****
     ****
      ***
       **
        *




class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int  i=1;i<=(n*2)-1;i++)
		{
			if(i<=n)
			{
				for(int j=i;j<n;j++)
				System.out.print(" ");
				
				for(int j=i;j>=1;j--)
				System.out.print("*");
			}

			else
			{

				for(int j=i;j>n;j--)
				System.out.print(" ");

				for(int j=i;j<=(n*2)-1;j++)
				System.out.print("*");
			}
		System.out.println();
		}
	}
}

*/



/*

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *






public class Pattern {
    public static void main(String[] args) {
        int n = 5; // This is the height of the pattern

        // Print the upper part of the pattern
        for (int i = 1; i <= n; i++) {
            // Print the first set of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print the spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print the second set of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Print the lower part of the pattern (which is a mirror of the upper part)
        for (int i = n - 1; i >= 1; i--) {
            // Print the first set of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print the spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print the second set of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}


*/


/*

    1
   22
  333
 4444
55555
 4444
  333
   22
    1



class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=(n*2)-1;i++)
		{
			if(i<=n)
			{
				for(int j=i;j<n;j++)
				System.out.print(" ");

				for(int j=i;j>=1;j--)
				System.out.print(i);
			}

			else
			{
				for(int j=i;j>n;j--)
				System.out.print(" ");

				for(int j=i;j<=(n*2)-1;j++)
				System.out.print((n*2)-i);
			
				
			}
		System.out.println();
		}
	}
}


*/


/*

    5
   44
  333
 2222
11111
 2222
  333
   44
    5



class Pattern
{
	public static void main(String args[])
	{
			int n=5;
			for(int i=1;i<=(n*2)-1;i++)
			{
				if(i<=n)
				{

					for(int j=i;j<n;j++)
					System.out.print(" ");
					for(int j=i;j>=1;j--)
					System.out.print((n-i)+1);
				}

				else
				{
					for(int j=i;j>n;j--)
					System.out.print(" ");
					for(int j=i;j<=(n*2)-1;j++)
					System.out.print((i-n)+1);
				}

			System.out.println();
			}
	}
}

*/

/*

    1
   12
  123
 1234
12345
 1234
  123
   12
    1




class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=(n*2)-1;i++)
		{	

			if(i<=n)
			{
				for(int j=i;j<n;j++)
				System.out.print(" ");

				for(int j=1;j<=i;j++)
				System.out.print(j);
			}

			else
			{
				for(int j=i;j>n;j--)
				System.out.print(" ");

				for(int j=1;j<=(n*2)-i;j++)
				System.out.print(j);

			}

		System.out.println();
		}
	}
}


*/

/*

         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *



class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2)-1;j++)
			{
				if(j%2!=0)
				System.out.print("*");

				else
				System.out.print(" ");	
			}

			
		System.out.println();


			for(int j=i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=i+1;j<(n*2)-i;j++)
			{
				if(j%2!=0)
				System.out.print("*");

				else
				System.out.print(" ");	
			}
			System.out.println();
		}
	}
}


*/



/*

*****
*  *
* *
**
*



class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				if(i==1||i==j||j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		System.out.println();
		}
	}
}

*/


/*

*
**
* *
*  *
***** 



class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				if(i==j||i==n||j==1)  
					System.out.print("*");
				else
					System.out.print(" ");
			}
		System.out.println();
		}
	}
}

*/


/*

    *
   **
  * *
 *  *    
*****




class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==n||j==n||i==2 & j==4||i==3 & j==3|| i==4 & j==2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		System.out.println();
		}

		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==n||j==n||i==2 & j==4||i==3 & j==3|| i==4 & j==2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		System.out.println();
		}

	}
}


*/



/*


*    *
*   **
*  * *
**   *
*    *   



class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(1==j||j==n||i==2 & j==4||i==3 & j==3||i==4 & j==2) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
		System.out.println();
		}
	}
}

*/


/*

*
**
***
****
*****



class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			//System.out.print("*");
			//System.out.print((char)(j+64));
			//System.out.print((char)(j+96));
			//System.out.print(j);
			System.out.print(i);
			}
		System.out.println();
		}
	}
}


*/


/*

*****
   *
  *
 *
*****



class Pattern
{
 	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==4&i==2||j==3&i==3||j==2&i==4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		System.out.println();
		}
	}
}
			
*/	


/*
  
*     	 	     *    
 *    	 	    *
  *  		   *
   * 		  *
    *            *


class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)	
		{
			for(int j=1;j<=n;j++)
				if(i==j)
					System.out.print("*");
				else
					System.out.print(" ");
		System.out.println();
		}
	}
}	


*/


/*

1 	3 	6 	10 	15
  	2 	5 	9  	14
    		4 	8  	13
      			7  	12
	 			11



class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=i;j>1;j--)
			{
				System.out.print("\t");
			}
			
			for(int j=i;j<=n;j++)
			{
				System.out.print(c+ "\t");
				c+=j+1;
			}
		System.out.println();
		count += i;
		}
	}
}


*/



/*

15	14	12	9	5	
	13	11	8	4
		10	7	3
			6	2
				1



class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		int count=(n*(n+1))/2;
		
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=i;j>1;j--)
			{
				System.out.print("\t");
			}
			
			for(int j=i;j<=n;j++)
			{
				System.out.print(c+"\t");
				c-=j;
			}
		System.out.println();
		count-=i+1;
		}
	}
}


*/



/*

					
				15	
			13	14		
		10	11	12						
	6	7	8	9
1	2	3	4	5




class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		int count=(n*(n+1)/2);
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=i;j<n;j++)
				System.out.print("\t");

			for(int j=i;j>=1;j--)
			{
				System.out.print(c+"\t");
				c++;
			}
		System.out.println();
		count-=i+1;
		}
	}
}	

*/



/*

1 
2  3
4  5  6 
7  8  9 10
11 12 13 14 15




class Pattern
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(count+" ");
				count++;
			} 
		System.out.println();
		}
	}
}

*/

			
























		












			




		