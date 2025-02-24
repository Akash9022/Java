/*


import java.util.*;
import java.util.stream.Collectors;

class Practice2
{
	public static void main(String args[])
	{
		String name="akash rohidas jadhav";
		System.out.println(name);
		System.out.println("Hello "+name);
		System.out.println(name.concat(" Jadhav"));
		System.out.println(name.charAt(1));
		System.out.println(name.length());
		System.out.println(name.chars().filter(ch -> ch=='a').count());
		System.out.println(name.chars().filter(ch->ch=='s').count());

		String love="Akash";
		System.out.println(love);
		System.out.println(love.replace("Akash"," Akash love with "+"Suhan"+"i"));
		System.out.println(love.reverse());		
		
				
	}
}

*/



/*


class Practice2
{
	public static void main(String args[])
	{
		String name= "hello,akash,how,are,you";
		String[] worlds=name.split(",");
		String reserved=" ";
		for( int i=worlds.length-1;i>=0;i--)
		{
			reserved+=worlds[i];
			if(i!=0)
				reserved+=" ";
		
		}
		System.out.println(reserved);	
	}
}
	

*/


/*

class Practice2
{
	public static void main(String args[])
	{
		String name= "Akash Rohidas Jadhav";	
		//String[] Worlds=name.split(" ");
		
		//String rearranged = Worlds[2]+" "+Worlds[0]+" "+Worlds[1];
		//System.out.println(rearranged);


		//if(Worlds.length % 2 == 1)
		//{
			
			int midleIndex=name.length()/2;
			String midleCharacter= name.substring(midleIndex-1,midleIndex+1);
			System.out.println("the length of string is:"+name.length());
			System.out.println(midleCharacter);

			//double medianIndex = Worlds.length/2;
			//System.out.println(Worlds[medianIndex]);
		//}
		//else
		//{
			//System.out.println("no median");
		//}

		*/





	/*String s1="hello i am java dveloper";
	String s2="AEIOUaeiou";
	StringBuilder sb= new StringBuilder();
	StringBuilder vow=new StringBuilder();

	for(int i=0;i<s1.length();i++)
	{
		char c= s1.charAt(i);
		if(s2.contains(String.valueOf(c)));
		{
			vow.append(c);
		}
		else
			if(c!=' ')
				sb.append(c);

	}
	sb.append(vow);
	for(int i=0;i<s1.length();i++)
	
		if(s1.charAt(i)==' ')
			sb.insert(i,' ');
	System.out.println(sb);*/


		

	
	

	}
}




	
			