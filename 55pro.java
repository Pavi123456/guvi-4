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
		String st1,st2;
		Scanner s=new Scanner(System.in);
		st1=s.next();
		st2=s.next();
		st1=st1.toLowerCase();
		st2=st2.toLowerCase();
		if(st1.length()!=st2.length()){
		System.out.print("no");
		return;
		}
		boolean flg=true;
		for(int i=0;i<st1.length();i++)
		{
			if(st1.charAt(i)!=st2.charAt(i)){
			flg=false;
			break;
		}}
		if(flg)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
