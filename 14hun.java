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
		String st=s.next();
		char[] a=st.toCharArray();
		int n=a.length;
		char temp;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				for(int k=0;k<n;k++)
				{
					System.out.print(a[k]);
				}
				System.out.println();
			}
		}
	}
}
