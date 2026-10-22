package Recursion;

import java.util.Scanner;

public class CountVowel {

    public static int countVowels(String s, int index) {
        if (index == s.length()) {
            return 0;
        }

        char ch = Character.toLowerCase(s.charAt(index));

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return 1 + countVowels(s, index + 1);
        }

        return countVowels(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(countVowels(s, 0));
    }


}
