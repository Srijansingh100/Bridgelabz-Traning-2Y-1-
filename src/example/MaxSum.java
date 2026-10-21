package example;

import java.util.Scanner;

public class MaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int p=arr.length;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        int sum=0;
        int k=sc.nextInt();
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        int max=sum;
        for(int i=k;i<p;i++){
            sum=sum+arr[i]-arr[i-k];
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}
