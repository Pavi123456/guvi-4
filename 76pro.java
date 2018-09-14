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
		int n,temp=0,temp1=0,even=0,odd=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				even=even+1;
				temp=a[i];
				
			}
			else
			{
				odd=odd+1;
				temp1=a[i];
			}
		}
		if(even==1)
		{
			System.out.print(temp);
		}
		else
		{
			System.out.print(temp1);
		}
		
	}
}
