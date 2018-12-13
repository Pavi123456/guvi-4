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
		int m=s.nextInt();
		int[] a=new int[n];
		int[] b=new int[m];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(int j=0;j<m;j++)
		{
			b[j]=s.nextInt();
			
		}
		Arrays.sort(b);
		int res=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(a[i]==b[j])
				{
				res++;
		
			//	}
			
		
				if(res==1)
				System.out.print(a[i]);
				else
				System.out.print(" "+a[i]);
		}	}
		}
		
	
	}
}
