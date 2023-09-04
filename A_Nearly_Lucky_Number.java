import java.util.*;
public class A_Nearly_Lucky_Number{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int k;
int f=0;
int count=0;
while(k-->1){
    k=n/10;
    f=n%10;
    if(f!=4 || f!=7){
        count++;
    }
}
if(count>0){
    System.out.println("NO");
}else{
    System.out.println("YES");
}
}
}