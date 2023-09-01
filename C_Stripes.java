import java.util.*;
public class C_Stripes{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
while(t-->0){
    char[][] c = new char[8][8];

    for(int i=0;i<8;i++){
        String row = sc.next();
        for(int j=0;j<8;j++){
            c[i][j] = row.charAt(j);
        }
    }

    int count=0;
    for(int j=0;j<8;j++){
       for(int i=0;i<8;i++){
        if(c[i][j]=='R'){
            count++;
        }
       } 
    }

    

    if(count==8){
        System.out.println("R");
    }else{
        System.out.println("B");
    }
}
}
}