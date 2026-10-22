package Recursion;

import java.util.Scanner;

public class RemoveDuplicate {
    static String remove(String str, int i, String ans) {
        if (i == str.length()) {
            return ans;
        }

        char ch = str.charAt(i);

        if (ans.indexOf(ch) == -1) {
            ans = ans + ch;
        }

        return remove(str, i + 1, ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(remove(str, 0, ""));
    }
}
