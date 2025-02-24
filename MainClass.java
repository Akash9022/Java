// what is mutability and immutability in string 

// immutable string

import java.lang.String;


/*
class MainClass
{
	public static void main(String[] args)
	{
		String s=new String("Akash");
		s.concat("Jadhav"); // not used reference variable 
		//String modify=s;
		//modify=s.concat("Jadhav"); // if we use reference variable then only possible
		System.out.println(s);
	}
}

*/





// mutable string that is known as stringbuffer


/*

class MainClass
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Akash");
		sb.append(" Jadhav");
		System.out.println(sb);
	}
}


*/



/*
class MainClass
{
	public static void main(String args[])
	{
		StringBuilder s= new StringBuilder("Akash is best");
		s.reverse();
		String result=s.toString();
		System.out.println(result);
	}
}

*/

/*
class MainClass
{
	public static void main(String args[])
	{
		String formattedString = String.format(Locale.US, "Hello, %s! You have %d new messages.", "John", 5);  
		System.out.println(formattedString); 
	}
} 
*/


/*
import java.util.Arrays;
class MainClass
{
	public static void main(String args[])
	{
		String s1="Akash";
		char[] charArray= s1.toCharArray();
		Arrays.sort(charArray);
		String s2=new String(charArray);
		System.out.println(s2);
	}
}


*/

/*
class MainClass
{
	public static void main(String args[])
	{
		String s1="COMPUTER";
		StringBuilder sb= new StringBuilder();
		sb.append(s1.substring(1,s1.length()-1));
		sb.append(s1.charAt(0));
		sb.append(s1.charAt(s1.length()-1));
		System.out.println(sb);
	}
}

*/



/*
class MainClass
{
	public static void main(String args[])
	{
		
		String s1="Computer";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s1.length();i++)
		{
			sb.append(s1.charAt(i));
			//sb.append(i+1);
			sb.append(s1.length()-i);
		}
		System.out.println(sb);
	}
}

*/


/*
class MainClass
{
	public static void main(String args[])
	{
		String s1="Computer";
		for(int i=0;i<s1.length();i++)
			System.out.println(s1.substring(0,i+1));
		
	}
}

*/

/*
class MainClass
{
	public static void main(String args[])
	{
		String s1="School";
		for(int i=0;i<s1.length();i++)
			
			System.out.println(s1.substring(0,i+1));
		for(int i=0;i<(s1.length()-i)*2;i++)
			System.out.print("\t");
		for(int i=0;i<s1.length();i++)
			System.out.println(s1.substring(0,i+1));	
	}
}

*/



/*
1                   1
1 2               2 1
1 2 3           3 2 1 
1 2 3 4       4 3 2 1
1 2 3 4 5   5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
*/


/*
class MainClass
{
	public static void main(String args[])
	{
		int n=6;
		for(int i=1;i<=n;i++)
		{
			
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				
				
			}
						
			int spaces=(i*2)-3;
			for(int j=1;j<=spaces;j++)
				System.out.print(" ");

			for(int j=i;j>=1;j--)
			{
				
				System.out.print(j);	
				
				
			}
			System.out.println();

		}
		
	}
}

*/

/*
class MainClass {
    public static void main(String[] args) {
        String word = "School"; 
        int n = word.length();          
        for (int i = 1; i <= n; i++) {
            
	    if(i==6)
	    {
		for(int j=0;j<n;j++)
			System.out.print(word.charAt(j) +" ");
		for(int j=4;j>=0;j--)
			System.out.print(word.charAt(j) +" ");
            }
	    else{

            for (int j = 0; j < i; j++) {
                System.out.print(word.charAt(j) + " ");
            }
            
            
            for (int j = 2; j <= (n - i) * 2; j++) {
                System.out.print("  ");
            }
            
            
            for (int j = i-1; j >= 0; j--) {
                System.out.print(word.charAt(j) + " ");
            }

	   }
	        
            System.out.println();
        }
    }
}
*/

/*
import java.util.Arrays;
class MainClass
{
	public static void main(String[] args)
	{
		String s1="hello i am java developer";
		String[] s2=s1.split(" ");
		StringBuilder sb=new StringBuilder(s1);
		sb.reverse();
		for(int i=0;i<s2.length;i++)
		{
			sb.append(new StringBuilder(s2[i]).reverse());
			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
		
		
	}
}

*/


/*
class MainClass
{
	public static void main(String args[])
	{
		String s1="hello i am java developer";
		String s2[]=s1.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s2.length;i++)
		{
			String temp=s2[i];
			sb.append(temp);
			sb.append(temp.length());
			if(i<s2.length-1)
				sb.append(" ");	
		}
		System.out.println(sb);
	}
}

*/



/*
// WAP to shift first character to last from each word of string

import java.lang.String;
class MainClass
{
	public static void main(String args[])
	{
		String s1="hello i am java developer";
		String s2[]=s1.split(" "); 
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s2.length;i++)
		{
		sb.append(s2[i].substring(1));
		sb.append(s2[i].charAt(0));
		if(i<s2.length-1)
			sb.append(" ");
		}
		System.out.println(sb);
		
		
	}
}

*/

/*

class MainClass
{
	public static void main(String args[])
	{
		String s1="hello i am java developer";
		String s2[]=s1.split(" ");
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<s2.length;i++)
		{
			String temp=s2[i];
			sb.append(temp.charAt(temp.length()-1));
			sb.append(temp.substring(0,temp.length()-1));
			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}

*/


/*
// WAP to find longest word in String

class MainClass
{
	public static void main(String args[])
	{
		String s1="welcome to international airport";
		String s2[]=s1.split(" ");
		int max=0;

		for(int i=0;i<s2.length;i++)
		{
			String temp=s2[i];
			if(max<temp.length())
				max=temp.length();	
		}
		
		for(int i=0;i<s2.length;i++)
		{
			String temp=s2[i];
			if(max==temp.length())
				System.out.println(temp);
		}
	}
}

*/

/*
class MainClass
{
	public static void main(String args[])
	{

		// charAt method

		String s1="hello i am coder";
		System.out.println(s1.charAt((s1.length())-2));


		// 
	}
}
		
*/


// WAP to check palindromic words in a string

class MainClass
{
	public static void main(String args[])
	{
		/*String s1="hello nitin freinds nayan and naman";
		String s2[]=s1.split(" ");

		for(String word:s2)
		{
			boolean isPalindrome=true;
			int length=word.length();

			for(int i=0;i<length/2;i++)
			{
			
				if(word.charAt(i)!=word.charAt(length-1-i))
				{	
					isPalindrome=false;
					break;
				}
							
			}
			if(isPalindrome)
				System.out.println(word);

		}*/
		
	


         // OR
/*
String s1 = "hello nitin freinds nayan and naman";
String s2[]= s1.split(" ");
for( int i=0;i<s2.length;i++)
	{
	String temp=s2[i];
	//StringBuilder sb = new StringBuilder(temp);
	//String t =sb.reverse().toString();
	//if(t.equals(temp))
		//or
	if(temp.equalsIgnoreCase(new StringBuilder(temp).reverse().toString()))
		System.out.println(temp);
	}
	}
}*/


/*
import java.util.Arrays;
String s1="hello i am java developer";
String s2[]= s1.split(" ");
Arrays.sort(s2);
StringBuilder sb=new StringBuilder();
for(int i=0;i<s2.length;i++)
{
	sb.append(s2[i]);
	if(i<s2.length-1)
		
}

System.out.println(sb);
	
}
*/


/*
String s1="hello i am java developer";
String s2[]=s1.split(" ");
StringBuilder sb = new StringBuilder();
for(int i=0;i<s2.length-1;i++)

	for(int j=i+1;j<s2.length;j++)
	{
		if(s2[i].length()>s2[j].length())
		{
			String temp=s2[i];
			s2[i]=s2[j];
			s2[j]=temp;
		}
	}

	for(int i=0;i<s2.length;i++)
	{
		sb.append(s2[i]);
		if(i<s2.length-1)
		{
			sb.append(" ");	
		}
			
	}
	System.out.println(sb);
	

}

}

*/



/*
String s1="hello i am java developer";
String s2[]=s1.split(" ");
StringBuilder sb= new StringBuilder();
StringBuilder sb1= new StringBuilder();
for(int i=0;i<s2.length;i++)
{
	sb.append(s2[i].substring(1));
	sb.append(" ");
	sb1.append(s2[i].charAt(0));
	
}
sb.append(sb1);
System.out.println(sb);
}
}
*/


/*
String s1="hello i am java developer";
StringBuilder sb=new StringBuilder();
String s2="AEIOUaeiou";
int count=0;
	for(int i=0;i<s1.length();i++)	
	{
		if(s2.contains(String.valueOf(s1.charAt(i))))	
		{
			//sb.append(s1.charAt(i));
			sb.append(++count);
		}
		else
			sb.append(s1.charAt(i));

		if(s1.charAt(i)==' ')
			count=0;
		
	}
	System.out.println(sb);


*/


/*

	String s1="hello i am java developer";
	String s2[]=s1.split(" ");
	String vow="AEIOUaeiou";
	StringBuilder sb1= new StringBuilder();
	
		for(int i=0;i<s2.length;i++)
		{
			String s3=s2[i];
			StringBuilder sb=new StringBuilder();
			int count=0;
			for(int j=0;j<s3.length();j++)
			{
				char ch=s3.charAt(j);
				if(vow.contains(String.valueOf(ch)))
					sb.append(++count);
				else
					sb.append(ch);
			}
			
			sb1.append(sb);
			if(i<s2.length-1)
				sb1.append(" ");
			
		}
		System.out.println(sb1);

*/

/*
String s1= new String("hello");
String s2= new String("hello");
System.out.println(s1==s2);
System.out.println(s1.equals(s2));
*/


/*
// WAP to capitalise every  first letter of words

	String s1="hello i am java developer";
	String s2[]=s1.split(" ");
	StringBuilder sb= new StringBuilder();
	for(int i=0;i<s2.length;i++)
	{
		String temp=s2[i];
		sb.append(Character.toUpperCase(temp.charAt(0)));
		sb.append(temp.substring(1));
		if(i<s2.length-1)
			sb.append(" ");		
	}
	System.out.println(sb);

*/

	/*
	String s1="hello i am java developer";
	String s2="AEIOUaeiou";
	StringBuilder sb= new StringBuilder();
	StringBuilder vow=new StringBuilder();
	for(int i=0;i<s1.length();i++)
	{
		char c = s1.charAt(i);
		if(!s2.contains(String.valueOf(c)))
			sb.append(c);
			
		else
			sb.append(Character.toUpperCase(c));	
	}
	System.out.println(sb);
	*/


	String s1="where is naman?? rajesh looking for him!!!";
	String s2="!?";
	StringBuilder sb=new StringBuilder();
	int count=0;
	for(int i=0;i<s1.length();i++)
	{
		char c=s1.charAt(i);
		if(s2.contains(String.valueOf(c)))
		count++;


		// or

		if(!Character.isLetterOrDigit(c))
			if(!Character.isWhitespace(c))
				count++;	
	}
	System.out.println(count);
	
	
	}
}


		





