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
		String st,rev="";
		Scanner s=new Scanner(System.in);
		st=s.nextLine();
		int i;
		int n=st.length();
		for(i=n-1;i>=0;i-- )
		rev=rev+st.charAt(i);
		if(st.equals(rev))
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
