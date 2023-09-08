//https://codeforces.com/problemset/problem/116/A

import java.util.*;
public class A_Tram{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int count = 0;
int max=0;
while(n-->0){
    int a=sc.nextInt();
    int b=sc.nextInt();
    count = count + (b - a);
    if(count>max){
        max = count;
    }
}
System.out.println(max);
}
}