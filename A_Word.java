//https://codeforces.com/problemset/problem/59/A

import java.util.*;

import java.util.Scanner;

public class A_Word{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s = sc.next();
int k=0 , l=0;
for(int i=0;i<s.length();i++){
    int x= s.charAt(i);
    if(x>=97){
        k++;
    }else{
        l++;
    }
}

if(k>=l){
    System.out.println(s.toLowerCase());
}else{
    System.out.println(s.toUpperCase());
}
}
}



