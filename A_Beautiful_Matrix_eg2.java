//https://codeforces.com/problemset/problem/263/A

import java.util.*;
public class A_Beautiful_Matrix_eg2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i , j ;
        int Matrix[][] = new int[5][5];
        int x=0,y=0;
        
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                Matrix[i][j]=sc.nextInt();
 
               if(Matrix[i][j]==1){
                    x=i;
                    y=j;
               } 
            }
        }
 
        System.out.println(Math.abs(2-x) + Math.abs(2-y));
    }    
}