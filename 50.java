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
		int n;
		boolean b=false;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++)
			{
				if(Math.pow(2,i)==n)
				b=true;
			}
			if(b==true)
			System.out.println("yes");
		else
			System.out.println("no");
	
		}
	}
}
