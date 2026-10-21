package recursion;

import static java.lang.Math.pow;

public class PowerOfN {
    public static int pow(int n,int p){
        if(p==0){
            return 1;

        }
        return n*pow(n,p-1);

    }

    public static void main(String[] args) {
        System.out.println(pow(5,4));
    }
}
