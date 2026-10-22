package recursion;

public class MaxArray {
    int max(int arr[],int index, int max){
        if(index==0){
            return max;
        }

        if(arr[index] >max  ){
            max=arr[index];
        }
        return max(arr,index-1,max);

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,7};
        System.out.println(new MaxArray().max(arr,3, 0));
    }
}
