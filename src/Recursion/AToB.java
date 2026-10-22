package Recursion;

import java.util.Scanner;

public class AToB {
    static String replace(String str, int i) {
        if (i == str.length()) {
            return "";
        }

        String ans = replace(str, i + 1);

        if (str.charAt(i) == 'a') {
            return 'b' + ans;
        }

        return str.charAt(i) + ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(replace(str, 0));
    }
}
