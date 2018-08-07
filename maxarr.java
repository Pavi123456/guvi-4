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
		int max,i;
		//int n=10;
		int a[]=new int[20];
		Scanner s=new Scanner(System.in);
		//n=s.nextInt();
		for(i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		
		}
		max=a[0];
		for(i=0;i<10;i++)
                        {
		
		if(max<a[i]);
	             	{
		             max=a[i];
			         }   }
		System.out.print(max);
	}
}
