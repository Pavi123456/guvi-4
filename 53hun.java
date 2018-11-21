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
		String st=s.next();
		int n=s.nextInt();
		int l=st.length();
		for(int i=0;i<=l-n;i++)
		{
			System.out.print(st.substring(i,i+n)+" ");
		}
	}
}
