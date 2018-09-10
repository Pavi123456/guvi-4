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
		int n,k=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		int a1[]=new int[n];
		
	
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			a1[i]=s.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(a1);
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]==a1[j])
				{
				 k++;
				 if(k==1)
				 System.out.print(a[i]);
				 else
				 System.out.print(" "+a[i]);
				}
			}
		}
	}
}
