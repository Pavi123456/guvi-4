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
		int n,m=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{m++;
		if(m==1) 
		{
		if(a[i]>a[i+1])
			
			
			System.out.print(a[i]);
			else
			System.out.print(a[i+1]);
		}
		else
		{
		if(a[i]>a[i+1])
		{
		System.out.print(" ");
		System.out.print(a[i]);
		}
		else
		{
		System.out.print(" ");
		System.out.print(a[i+1]);
		}
		}
	}
}}
