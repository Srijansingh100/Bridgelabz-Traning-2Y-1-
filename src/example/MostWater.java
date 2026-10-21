package example;

import java.util.Scanner;

public class MostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right= arr.length-1;
        int max=0;
        while(left<right){
            int width=right-left;
            int h=Math.min(arr[left],arr[right]);
            int area=width*h;
            max=Math.max(max,area);
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }

        }
        System.out.println(max);
    }
}
