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
		int n,k,t=1,t1=1,t2=1;
		n=s.nextInt();
		k=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			t=t*i;
		}
		for(int i=1;i<=(n-k);i++)
		{
			t1=t1*i;
		}
		System.out.println(t/t1);
	
	
	
	}
}
