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
		String s1=s.next();
		String s2=s.next();
		long l1=Integer.parseUnsignedInt(s1);
		long l2=Integer.parseUnsignedInt(s2);
		System.out.println(String.valueOf(l1*l2));
	}
}
