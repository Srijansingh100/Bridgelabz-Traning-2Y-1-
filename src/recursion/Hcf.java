package recursion;

import org.w3c.dom.ls.LSOutput;

public class Hcf {
    public static int hcf(int p,int q){
        if(q%p==0){
            return p;
        }
        return hcf(q,p%q);
    }


    public static void main(String[] args) {
        int p=12;
        int q=18;

        System.out.println(hcf(p,q));
        int lcm = 32 * 16/hcf(32, 16);;
        System.out.println(lcm);
    }


}
