import java.util.*;
public class A_Elephant{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int count=0;

while(x>=1){
    if(x>=5){
        x=x-5;
        count++;
    }else if(x<5 && x>=4){
        x=x-4;
        count++;
    }else if(x<4 && x>=3){
        x=x-3;
        count++;
    }else if(x<3 && x>=2){
        x=x-2;
        count++;
    }else if(x<2 && x>=1){
        x=x-1;
        count++;
    }
}

System.out.println(count);
}
}
