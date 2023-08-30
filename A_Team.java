//https://codeforces.com/problemset/problem/231/A
import java.util.*;
public class A_Team{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         
         int ans = 0;
         while(n-->0){
            int count = 0;
            int[] Array = new int [3];
            for(int i=0;i<3;i++){
                Array[i]=sc.nextInt();
            }
            for(int i=0;i<3;i++){
                if(Array[i]==1){
                    count++;
                }
            }
            if(count>=2){
                ans++;
            }
         }  
         System.out.println(ans);  
    }
}