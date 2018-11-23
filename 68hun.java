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
		int max=-999,min=99,i,x=0,y=0;
		int n=s.nextInt();
		int[] a=new int[20];
		for(i=1;i<=n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=1;i<=n;i++)
		{
		  if(a[i]>max)
		  {
		  	max=a[i];
		  	x=i;
		  }
		}
		 // System.out.print(max);
		
		for(i=1;i<=n;i++)
		{
		   if(a[i]<min)
		  {
		  	min=a[i];
		  	y=i;
		  }
		}
		  System.out.print(y+" "+x);
		
	}
}
