import java.util.Arrays;

public class SelectionSort {

    public SelectionSort() {
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] array;
        array = new int[]{8,3,6,8,1,2,3,2,1};
        System.out.println(Arrays.toString(selectionSort.SelectionSorting(array)));
    }

    public int [] SelectionSorting(int[] array) {
        int min;
        for (int i = 0; i < array.length; i++) {
            min = i;
            System.out.println(min);
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }

}


