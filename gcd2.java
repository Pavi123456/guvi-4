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
		int a,b;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		int res=1;
		for(int i=1;i<=a && i<=b;++i)
		{
			if(a%i==0 && b%i==0)
			res=i;
		}
		System.out.println(res);
	}
}
