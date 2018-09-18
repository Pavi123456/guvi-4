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
		int n,m=0,count=0;
		Scanner s=new Scanner (System.in);
		n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			if(a[i]==a[i+1])
			{m=m+1;
		
			if(m==1)
			System.out.print(a[i]);
			else
			System.out.print(" "+a[i]);
			count=count+1;
	                        }
		}
	                        if(count==0)
	                        System.out.print("unique");
		
		
			
		
		
	}
}
