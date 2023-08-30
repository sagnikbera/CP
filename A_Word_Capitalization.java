//https://codeforces.com/problemset/problem/281/A

import java.util.Scanner;
 
public class A_Word_Capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
 
        // Convert the first character to uppercase and concatenate with the rest of the word
        String capitalizedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);
 
        System.out.println(capitalizedWord);
    }
}