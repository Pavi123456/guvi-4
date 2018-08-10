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
		int h1=s.nextInt();
		int m1=s.nextInt();
		int h2=s.nextInt();
		
		int m2=s.nextInt();
		int h;
		int m;
		if(h2>h1)
		{
			h=h2-h1;
		}
		else
		h=h1-h2;
		if(m2>m1)
		m=m2-m1;
		else
		m=m1-m2;
			System.out.print(h+" "+m);
		
	}
}
