package Recursion;

import java.util.Scanner;

public class RemoveOcurrane {
    static String remove(String str, char ch, int i) {
        if (i == str.length()) {
            return "";
        }

        String ans = remove(str, ch, i + 1);

        if (str.charAt(i) == ch) {
            return ans;
        }

        return str.charAt(i) + ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        System.out.println(remove(str, ch, 0));
    }
}
