//https://codeforces.com/problemset/problem/263/A

import java.util.*;
public class A_Beautiful_Matrix_eg1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Matrix [][] = new int[5][5];
        int x=0,y=0;
        int i,j;
        int count = 0;
        int counts = 0;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                Matrix[i][j]=sc.nextInt();
 
                // if(Matrix[i][j]==1){
                // x=i;
                // y=j;
            }
            }
        
 
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                // Matrix[i][j]=sc.nextInt();
 
                if( Matrix[i][j]==1 ){
                x=i;
                y=j;
            }
            }
        }
 
        while(x!=2){
            if(x>2){
                x--;
                count++;
            }else{
                x++;
                count++;
            }
        }
 
        while(y!=2){
            if(y>2){
                y--;
                counts++;
            }else{
                y++;
                counts++;
            }
        }
System.out.println(count+counts);
    }
    }
    