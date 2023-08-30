//https://codeforces.com/problemset/problem/4/A
import java.util.*;
public class A_Watermelon{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        if(n==2){
            System.out.println("NO");
        }else if(n%2==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
