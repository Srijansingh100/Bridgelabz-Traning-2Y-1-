package PatternPrinting;

import java.util.Scanner;

public class Q1Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
