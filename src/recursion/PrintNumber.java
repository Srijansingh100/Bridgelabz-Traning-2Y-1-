package recursion;

public class PrintNumber {
    public static void print(int n){
        if(n==5){
            System.out.println(n+" ");
            return;
        }
        print(n+1);
        System.out.println(n+" ");
    }

    public static void main(String[] args) {
        print(4);
    }
}
