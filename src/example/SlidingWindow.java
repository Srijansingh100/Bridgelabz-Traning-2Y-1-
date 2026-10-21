package example;

import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max,sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        max=sum;
        for(int i=k;i<arr.length;i++){
            sum=sum-arr[i-k]+arr[i];
            max=Math.max(sum,max);
        }
        System.out.println(max);
    }

}
