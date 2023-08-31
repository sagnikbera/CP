//https://codeforces.com/problemset/problem/791/A
import java.util.*;

import java.util.Scanner;

public class A_Bear_and_Big_Brother{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b=sc.nextInt();

   int count = 0;
   while(a<=b){
    count++;
    a=a*3;
    b=b*2;
   } 
   System.out.println(count);
}
}