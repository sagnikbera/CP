//https://codeforces.com/problemset/problem/282/A
import java.util.*;
 
public class A_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Taking the number of operations as input
        int y = 0; // Initializing a variable to keep track of the value of y
 
        // Loop through each operation
        while (n-- > 0) {
            String s = sc.next(); // Taking the operation as input
            
            // Checking if the operation starts with 'x'
            if (s.charAt(0) == 'X') {
                // Checking if the operation adds or subtracts
                if (s.charAt(1) == '+') {
                    y++; // Increment y if it's an 'x+' operation
                } else {
                    y--; // Decrement y if it's an 'x-' operation
                }
            } else {
                // If the operation doesn't start with 'x', it's either '+x' or '-x'
                if (s.charAt(0) == '-') {
                    y--; // Decrement y for '-x' operation
                } else {
                    y++; // Increment y for '+x' operation
                }
            }
        }
 
        System.out.println(y); // Print the final value of y
    }
}