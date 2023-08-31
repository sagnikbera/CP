import java.util.*;
public class A_Stones_on_the_Table{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
        sc.nextLine();
    String str = sc.nextLine();

    int i , count = 0;
    for(i=1 ; i<n ; i++){
        if(str.charAt(i)==str.charAt(i-1))
        //comp ASCII value withe privous elemnet
        {
            count++;
        }
    }
System.out.println(count);
}
}