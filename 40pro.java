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
		int n=s.nextInt();
		String st=String.valueOf(n);
		int m=0;
		for(int i=(st.length()-1);i>=1;i--)
		{
			int y=Character.getNumericValue(st.charAt(i));
			m=m+y;
		}
		String ln=String.valueOf(m);
		String res=new StringBuffer(ln).reverse().toString();
		if(ln.equals(res))
		System.out.println("YES");
		else
		System.out.println("NO");
	}
}
