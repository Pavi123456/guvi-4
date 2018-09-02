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
		char c;
		int res=0;
		Scanner s=new Scanner(System.in);
		st=s.next();
		c=s.next().charAt(0);
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)==c)
			res++;
		}
		System.out.print(res);
	}
}
