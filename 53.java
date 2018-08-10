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
		int n,m;
		int sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n>0)
		{
			m=n%10;
			sum=sum+m;
			n=n/10;
		}
		System.out.print(sum);
		
	}
}
