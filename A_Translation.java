//https://codeforces.com/problemset/problem/41/A
import java.util.Scanner;

import java.util.Scanner;

public class A_Translation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String s = scanner.nextLine();
        String t = scanner.nextLine();


        if (s.equals(new StringBuilder(t).reverse().toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
