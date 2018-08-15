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
		String s;
        char temp;
        int i;
        Scanner read=new Scanner(System.in);
        s=read.next();
        char str[]=s.toCharArray();
        if(s.length()%2==0){
        for(i=0;i<str.length-1;i=i+2){
            temp=str[i];
            str[i]=str[i+1];
            str[i+1]=temp;
        }
        System.out.println(str);
        }else{
            for(i=0;i<str.length-1;i=i+2){
            temp=str[i];
            str[i]=str[i+1];
            str[i+1]=temp;
        }
        System.out.println(str);
        }
	}
}
