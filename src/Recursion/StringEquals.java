package Recursion;

import java.util.Scanner;

public class StringEquals {
    static boolean check(String s1, String s2, int i) {
        if (i == s1.length() && i == s2.length()) {
            return true;
        }

        if (i == s1.length() || i == s2.length()) {
            return false;
        }

        if (s1.charAt(i) != s2.charAt(i)) {
            return false;
        }

        return check(s1, s2, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (check(s1, s2, 0)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
