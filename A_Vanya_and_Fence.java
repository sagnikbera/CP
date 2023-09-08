import java.util.*;
public class A_Vanya_and_Fence{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int h = sc.nextInt();
int count = 0;
while(n-->0){
    int x = sc.nextInt();
    if(x>h){
        count=count+2;
    }else{
        count=count+1;
    }
}
System.out.println(count);
}
}