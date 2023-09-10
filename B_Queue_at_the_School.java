//https://codeforces.com/problemset/problem/266/B
import java.util.Scanner;

import java.util.Scanner;

public class B_Queue_at_the_School{
	public static void main(String[] A) {
		Scanner s = new Scanner(System.in);
		s.next();
		int t = s.nextInt();
		String a = s.next();
		for (; t-- > 0;)
			a = a.replaceAll("BG", "GB");
		System.out.print(a);
	}
}