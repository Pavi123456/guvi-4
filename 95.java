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
		int p,t,r;
		Scanner s=new Scanner(System.in);
		p=s.nextInt();
		t=s.nextInt();
		r=s.nextInt();
		double si;
		si=(p*t*r)/100;
		System.out.println(Math.round(si));
	}
}
