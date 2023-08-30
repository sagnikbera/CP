//https://codeforces.com/problemset/problem/236/A

import java.util.*;
public class A_Boy_or_Girl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 

        int j,i;
        int count=0;
        int len = str.length();
        int[] arr = new int[123]; 

        for (j = 0; j < str.length(); j++) {
            arr[str.charAt(j)]++;
        }
        for(i=97;i<123;i++){
            if(arr[i]!=0){
                count++;
            }
        }
        if(count%2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
        // System.out.println(count);
    }
}