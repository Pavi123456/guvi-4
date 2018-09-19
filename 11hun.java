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
		String st=s.nextLine();
		String str[]=st.split("\\s");
		for(int i=0;i<str.length;i++)
		{
			for(int j=str[i].length()-1;j>=0;j--)
			{
				System.out.print(str[i].charAt(j));
			}
			System.out.print(" ");
		}
	}
}
