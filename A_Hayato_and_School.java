//https://codeforces.com/contest/1780/problem/A

import java.util.*;
import java.io.*;

public class A_Hayato_and_School{
public static void main(String[] args) {
    public static Scanner obj = new Scanner(System.in);
	public static PrintWriter out = new PrintWriter(System.out);
 
	public static void main(String[] args) {
		int len = obj.nextInt();
		while (len-- != 0) {
			int n=obj.nextInt();
			long[] a=new long[n];
			Vector<Integer> o=new Vector<>();
			Vector<Integer> e=new Vector<>();
			for(int i=0;i<n;i++)
			{
				a[i]=obj.nextInt();
				if(a[i]%2==0)e.add(i+1);
				else o.add(i+1);
			}
			if(o.size()>=3)
			{
				out.println("YES");
				out.println(o.get(0)+" "+o.get(1)+" "+o.get(2));
			}
			else if(o.size()>=1 && e.size()>=2)
			{
				out.println("YES");
				out.println(o.get(0)+" "+e.get(0)+" "+e.get(1));
			}
			
			else out.println("NO");
				
				
				
 
		}
		out.flush();
}
}