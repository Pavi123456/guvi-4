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
		String st;
		String st1="";
		Scanner s=new Scanner(System.in);
		st=s.nextLine();
		boolean isBinary=false;
		for(int a=0;a<st.length();a++)
		{
		st1=st.substring(a,a+1);
		if((st1.equals("0")) || (st1.equals("1")))
		{
			isBinary=true;
		}
		else
		{
			isBinary=false;
			break;
		}
		}
		if(isBinary==true)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
