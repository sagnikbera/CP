//https://codeforces.com/problemset/problem/236/A

import java.util.*;
public class A_Boy_or_Girl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 

        int j,i;
        int count=0;
        for(j=0;j<str.length();j++){
            for(i=0;i<str.length();i++){
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
        }

        int distinct_Char = str.length() - count;
        if(distinct_Char%2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}