package example;

import java.util.Arrays;

public class RevArray {
    public static int[] arrrev(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
      int arr[]={2,3,4,5,6,7,8,91};
//        for(int i = arr.length-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }
        System.out.print(Arrays.toString(arrrev(arr)));

    }
}
