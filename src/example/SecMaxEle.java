package example;

import java.util.Scanner;

public class SecMaxEle {
    public static void main(String[] args) {
//        int arr[]={2,3,4,5,6,78,89};
//        int max= Integer.MIN_VALUE;
//        int SecMax=Integer.MIN_VALUE;
//        for(int  i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        for(int i =0;i<arr.length;i++){
//            if(arr[i]>SecMax && arr[i]!=max){
//                SecMax=arr[i];
//            }
//        }
//            System.out.println(SecMax);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println(smax);
    }
}
//package org.example;
//public class SecMaxEle {
//    public static void main(String[] args) {
//        int arr[] = {2, 3, 4, 5, 6, 78, 89};
//        int max = Integer.MIN_VALUE;
//        int SecMax = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > SecMax && arr[i] != max) {
//                SecMax = arr[i];
//            }
//        }
//        System.out.println(SecMax);
//    }
//}
