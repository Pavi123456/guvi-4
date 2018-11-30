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
		String st1=s.nextLine();
		char[] ch1=st.toCharArray();
		char[] ch2=st1.toCharArray();
		int count=0,res=0;
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch2.length;j++)
			{
				
			
			if(ch1[i]==ch2[j])
			{
				System.out.print(i);
				i=ch1.length;
				count++;
				break;
			}
			}
			}
			if(count==0)
			System.out.print(-1);
			
			
			
		
	}
}
