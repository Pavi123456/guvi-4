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
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		Stack st1=new Stack();
		int n=st.length();
		for(int i=0;i<n;i++)
		{
			st1.push(st.charAt(i));
		}
		String rev="";
		while(!st1.isEmpty())
		{
			rev=rev+st1.pop();
		}
		if(st.equals(rev))
		System.out.print("YES");
		else
		System.out.print("NO");
	}
}
