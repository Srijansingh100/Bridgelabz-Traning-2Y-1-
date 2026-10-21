package recursion;

public class SumOfDigit {
    public static int sum(int n){
        if(n<10){
            return n;
        }
        int small1=n%10;
        int small2=sum(n/10);
        return small1+small2;
    }

    public static void main(String[] args) {
        System.out.println(sum(12345));
    }
}
