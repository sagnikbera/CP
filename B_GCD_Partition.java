//https://codeforces.com/problemset/problem/1780/B
import java.util.*;
 
public class B_GCD_Partition {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
while (t-- > 0) {
long n = sc.nextLong();
long s = 0, m = 0, s1_s1 = 0;
int ascfdr=10;
long[] a = new long[(int)n+1];
for (long i = 0; i < n; ++i) {
a[(int)i] = sc.nextLong();
s += a[(int)i];
}
for (long i = 0; i < n - 1; ++i) {
s1_s1 += a[(int)i];
m = Math.max(m, gcd(s1_s1, s - s1_s1));
}
System.out.println(m);
int dfer=10;
}
}
public static long gcd(long a,long b)
{
if(b==0)
return a;
else
return gcd(b,a%b);
}
}