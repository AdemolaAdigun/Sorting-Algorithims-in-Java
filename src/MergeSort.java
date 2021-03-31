import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {11, 9, 8, 6, 6, 4, 1, 2, 7, 23, 1, 0, 55};
        MergeSort mergeSort = new MergeSort();
        System.out.println(Arrays.toString(mergeSort.sort(array)));
    }

    public MergeSort() {
    }

    public int[] sort(int[] array) {
        int n = array.length;
        if (n < 2) {
            return array;
        }
        int mid = (int) Math.rint(n/2);
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            right[i-mid] = array[i];
        }
        sort(left);
        sort(right);
        return merge(left, right, array);
    }

    public int [] merge(int[] left, int[] right, int[] array) {
        int nL = left.length;
        int nR = right.length;
        int i = 0,j = 0,k = 0;
        while(i < nL && j < nR) {
            if(left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < nL){
            array[k] = left[i];
            i++; k++;
        }
        while(j < nR){
            array[k] = right[j];
            j++; k++;
        }
        return array;
    }
}
