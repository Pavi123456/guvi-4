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

		Scanner s=new Scanner(System.in);
		st=s.nextLine();
		boolean numeric = true;

        try {
            Double num = Double.parseDouble(st);
        } catch (NumberFormatException e) {
            numeric = false;
        }

		if(numeric)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
