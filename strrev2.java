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
		String st1="";
		Scanner s=new Scanner(System.in);
		st=s.nextLine();
		for(int i=st.length()-1;i>=0;i--)
		{
			st1=st1+st.charAt(i);
		}
		System.out.println(st1);
	}
}
