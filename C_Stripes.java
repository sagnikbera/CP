//https://codeforces.com/contest/1742/problem/C

import java.util.*;

import java.util.Scanner;

public class C_Stripes{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
while(t-->0){
    char[][] c = new char[8][8];

    for(int i=0;i<8;i++){
        String row = sc.next();
        for(int j=0;j<8;j++){
            c[i][j] = row.charAt(j);
        }
    }

    
    int f=0;
    for(int i=0;i<8;i++){
        int count=0;
       for(int j=0;j<8;j++){
        if(c[i][j]=='R'){
            count++;
        }
       } 
       if(count==8){
        f=1;
        break;
       }
    }

    

    if(f==1){
        System.out.println("R");
    }else{
        System.out.println("B");
    }
}
}
}