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
		String st1,st2;
		st1=s.next();
		st2=s.next();
		if(st1.length()>st2.length())
		System.out.println(st1);
		else
		System.out.println(st2);
	}
}
