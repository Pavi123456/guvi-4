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
		int x;
		int sum=0;
		int i=1;
		Scanner s=new Scanner(System.in);
		//System.out.print("N");
		x=s.nextInt();
		while(i<=x)
		{
			sum=sum+i;
			i++;
		}
			System.out.println(sum);
		
		

	}
}
