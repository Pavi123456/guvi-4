/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String st;
		String st1;
		Scanner s=new Scanner(System.in);
		st=s.next();
		st1=s.next();
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)==st1.charAt(count))
			
			count++;
			else
			count=0;
		}
		if(count==st1.length())
		
			System.out.print("yes");
			else
		System.out.print("no");	
		
		
	}
}
