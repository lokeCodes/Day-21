// https://www.codechef.com/problems/SALESEASON
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int x = s.nextInt();
		    if(x<=100){
		        System.out.println(x);
		    }else if(x>100 && x<=1000){
		        System.out.println(x-25);
		    }else if(x>1000 && x<=5000){
		        System.out.println(x-100);
		    }else{
		        System.out.println(x-500);
		    }
		    
		}
	}
}
