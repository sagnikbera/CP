//https://codeforces.com/problemset/problem/71/A
import java.util.*;
public class A_Way_Too_Long_Words{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String s;
         int n;
         n = sc.nextInt();
         sc.nextLine();
         for(int i=0 ; i<n ; i++){
            s = sc.nextLine();
            int l=s.length();
            int num = l-2;
            char first = s.charAt(0);
            char last = s.charAt(l-1);
 
            if(l>10){
                System.out.println(first+Integer.toString(num)+last);
            }else{
                System.out.println(s);
            }
         }        
    }
}