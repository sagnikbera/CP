//https://codeforces.com/contest/546/problem/A
import java.util.*;

import java.util.Scanner;

public class A_Soldier_and_Bananas{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int n = sc.nextInt();
    int w = sc.nextInt();

    int x = k*w*(w+1)/2;

    if(n>x){
        System.out.println("0");
    }else{
    System.out.println(x-n);
    }
}
}