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
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<st.length()-1;i=i+2)
		{
			char ch=st.charAt(i);
			int n=st.charAt(i+1)-'0';
			for(int j=0;j<n;j++)
			{
				sb.append(ch);
			}
		}
			System.out.print(sb.toString());
		
	}
}
