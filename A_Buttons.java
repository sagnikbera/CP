//https://codeforces.com/contest/1858/problem/A

import java.util.*;

import java.util.Scanner;

public class A_Buttons{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int t= sc.nextInt();
while(t-->0){
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    if(a>b){
        System.out.println("First");
    }else if(a<b){
        System.out.println("Second");
    }else{
        if(c%2==0){
            System.out.println("Second");
        }else{
            System.out.println("First");
        }
    }
   
}
}
}