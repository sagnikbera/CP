//https://codeforces.com/problemset/problem/158/A
import java.util.*;
public class A_Next_Round{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int k = sc.nextInt();
         int count = 0;
         int[] array = new int [n+1];
         for(int i=1 ; i<=n ; i++){
            array[i]= sc.nextInt();
         }
         for(int i=1 ; i<=n ; i++){
            
            if(array[i]>array[k] || array[i]==array[k]  && array[i]>0){
                count++;
            }
         }
         System.out.println(count);
    }
}