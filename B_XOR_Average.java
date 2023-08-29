// https://codeforces.com/contest/1758/problem/B

import java.util.*;
public class B_XOR_Average{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-->0){
            int n  = Sc.nextInt();
            if(n%2 != 0){
                for(int i=1;i<=n;i++){
                    System.out.print(1 + " ");
                }
            }else{
                System.out.print(1+" "+3+" ");
                for(int i=1;i<=n-2;i++){
                    System.out.print(2+" ");
                }              
            }
            System.out.println();
        }
    }
}
