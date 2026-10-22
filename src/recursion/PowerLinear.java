package recursion;

import java.util.Scanner;

import static java.lang.Math.pow;

public class PowerLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(pow(p,q));
    }
    public static int pow(int p,int q){
        if(q==0){
            return 1;
        }
        return p*pow(p,q-1);

    }
}
