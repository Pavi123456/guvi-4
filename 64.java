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
		int M,N,c;
		Scanner s=new Scanner(System.in);
		M=s.nextInt();
		N=s.nextInt();
		c=M+N;
		if(c%2==0)
		System.out.println("even");
		else
		System.out.println("odd");
		
	}
}
