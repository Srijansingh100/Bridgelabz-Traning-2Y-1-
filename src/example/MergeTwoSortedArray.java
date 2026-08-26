package example;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {2, 5, 7, 9};
        int[] b = {1, 3, 4, 6, 8};

        int[] c = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }

            k++;
        }

// a ke remaining elements
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

// b ke remaining elements
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
    }
}
