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
		int n,k,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		boolean flag=false;
		for(i=0;i<=n;i++)
		{
			if(Math.pow(k,i)==n)
			flag=true;
		}
		if(flag)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
