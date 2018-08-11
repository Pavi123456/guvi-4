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
		int N,L,R;
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		L=s.nextInt();
		R=s.nextInt();
		if(L<N && N<R)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
