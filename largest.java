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
		int a,b,c;
		Scanner s=new Scanner(System.in);
		//System.out.print("a");
		 a=s.nextInt();
		//System.out.print("b");
	    b=s.nextInt();
	    //Syetem.out.print("c");
	    c=s.nextInt();
	    if(a>b && a>c)
	    {
	    	System.out.print(a);
	    }
	    if(b>a && b>c)
	    {
	    	System.out.println(b);
	    }
	    if(c>a && c>b)
	    {
	    	System.out.println(c);
	    }	    
	    

	}
}
