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
		int a,b,c;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		boolean flag=false;
		if(a+b+c==180)
		{
			if(a==b || b==c || c==a)
			{
				flag=true;
			}
		}
		if(flag)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
