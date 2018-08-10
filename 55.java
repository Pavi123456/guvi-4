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
		int m,n;
		int res;
		Scanner s=new Scanner(System.in);
		m=s.nextInt();
		n=s.nextInt();
		res=m*n;
		if(res%2==0)
		System.out.println("even");
		else
		System.out.println("no");
	}
}
