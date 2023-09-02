import java.util.*;
public class A_Buttons{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int t= sc.nextInt();
while(t-->0){
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int temp;

   if(a==b){
    if(c%2==1){
        System.out.println("First");
    }else{
        System.out.println("Second");
    }
   }else if(a>b){
        temp=a-b;
        if(temp-c>=0){
            System.out.println("First");
        }else if(temp-c<0){
            if(c%2==1){
        System.out.println("First");
    }else{
        System.out.println("Second");
    } 
        }
   }else{//(b>a)
        temp=b-a;
        if(temp-c>=0){
            System.out.println("Second");
        }else if(temp-c<0){
            if(c%2==1){
        System.out.println("Second");
    }else{
        System.out.println("First");
    }
   }

}
}
}
}t 