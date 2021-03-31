import java.awt.geom.QuadCurve2D;
import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] array = {2, 2, 1, 3, 4, 5, 7, 7, 8, 8};
        System.out.println(Arrays.toString(quickSort.sort(array, 0, 9)));
    }

    public QuickSort() {
    }

    public int[] sort(int[] array, int start, int end) {
        if (start < end) {
            int pIndex = partition(array, start, end);
            sort(array, start, pIndex - 1);
            sort(array, pIndex + 1, end);
        }
        return array;
    }

    public int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int pIndex = start;
        for (int i = start; i < end; i++) {
            if (array[i] <= pivot) {
                int temp = array[i];
                array[i] = array[pIndex];
                array[pIndex] = temp;
                pIndex++;
            }
        }
        int temp = array[end];
        array[end] = array[pIndex];
        array[pIndex] = temp;
        return pIndex;
    }

}
