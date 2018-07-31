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
		int n,k;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		int l=0;
		for(int i=n+1;i<k;i++)
		{
			if(i%2!=0)
			{
				if(l<1)
				{
			
				System.out.print(i);
				}
				else
				{
					System.out.print(" ");
					System.out.print(i);
				}
				l++;
			}
			
		}
	}
}
