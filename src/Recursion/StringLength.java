package Recursion;

import java.util.Scanner;

public class StringLength {
    static int findLength(String str, int i) {
        if (i == str.toCharArray().length) {
            return i;
        }

        return findLength(str, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(findLength(str, 0));
    }
}
