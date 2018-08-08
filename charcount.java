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
		int sum=0;
		String st;
		Scanner s=new Scanner(System.in);
		st=s.nextLine();
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)==' ')
			{
				continue;
			}
			sum++;
		}
		System.out.print(sum);
	}
}
