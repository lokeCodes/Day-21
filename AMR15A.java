// https://www.codechef.com/problems/AMR15A
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
		int even = 0;
		int odd = 0;
		for (int i=0; i<t; i++){
		    int a = s.nextInt();
		    if(a%2 == 0){
		        even++;
		    }
		    else{
		        odd++;
		    }
		}
		if(even>odd){
		    System.out.println("READY FOR BATTLE");
		}
		else
		System.out.println("NOT READY");
	}
}
