package example;

public class RevElement {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9};
        int n = arr.length;
        int i=0,j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int t = 0; t < n; t++) {
            System.out.print(arr[t]+" ");
        }
    }
}
