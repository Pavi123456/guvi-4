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
		float l;
		float b;
		float a;
		Scanner s=new Scanner(System.in);
		l=s.nextFloat();
		b=s.nextFloat();
		a=l*b;
		//DecimalFormat df=new DecimalFormat("#.#####");
		System.out.format("%.5f",a);
	}
}
