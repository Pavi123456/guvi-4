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
		int n,p,result=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		p=s.nextInt();
		if (n>=0 && p==0)
		{
			result=1;
		
		}
		else
		{
			for(int i=0;i<p;i++)
			{
				result=result*n;
			}
		}
		System.out.println(result);
	}
	
}
