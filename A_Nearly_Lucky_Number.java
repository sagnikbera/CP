//https://codeforces.com/problemset/problem/110/A
import java.util.*;

import java.util.Scanner;

public class A_Nearly_Lucky_Number{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
long n = sc.nextLong();
int c=0;
while(n>0)
{

if(n%10==4||n%10==7)
{
c++;
}

n/=10;

}
if(c==4||c==7)
{
System.out.println("YES");
}
else{
System.out.println("NO");
}
}
}