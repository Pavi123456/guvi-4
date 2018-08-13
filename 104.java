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
		int N,K;
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		K=s.nextInt();
		double n=Math.pow(N,K);
		System.out.println(Math.round(n));
		}
		
}
