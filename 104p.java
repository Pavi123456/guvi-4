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
		int n=s.nextInt();
		int[] a=new int[n];
		int sum=0;
		int res=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			//res=0;
			res=a[i]+a[i+1];
			sum=sum+res;
			
		}
		System.out.print(sum);
		
	}
}
