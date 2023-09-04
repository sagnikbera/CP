import java.util.*;
public class A_Nearly_Lucky_Number{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
long n = sc.nextLong();
int count=0;
while(n>0){
    
    long f=n%10;
    if(f!=4 && f!=7){
        count++;
    }
    n=n/10;
}
if(count>0){
    System.out.println("NO");
}else{
    System.out.println("YES");
}
}
}