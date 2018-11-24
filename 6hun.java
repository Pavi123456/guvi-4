/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes hereSca
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[100];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
	      for(int i=0;i<n;i++)
	      {
	      	for(int j=i+1;i<n;i++)
	      	{
	      		
	      		
	      			if(a[i]==a[j]){
	      				System.out.print(a[j]);
	      				i=n;
	      				      				break;
	      			}
	      			else
	      	//		System.out.print("unique");
	      			continue;
	      		
	      	}
	      		

	      }
	}
}
