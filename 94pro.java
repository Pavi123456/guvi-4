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
		char[] ch=st.toCharArray();
		int n=ch.length;
		boolean be=true;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(ch[i]==ch[j])
				{
					be=false;
				}
			}
		}
		if(be==false)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
