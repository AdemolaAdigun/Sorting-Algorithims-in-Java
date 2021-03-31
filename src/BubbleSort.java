import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {11, 9, 8, 6, 6, 4, 1, 2, 4, 4, 3, 2, 9, 1};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("==========NORMAL==========");
        bubbleSort.normalSort(array);
        System.out.println("==========SMART==========");
        bubbleSort.smartSort(array);
    }

    public void normalSort(int[] array) {
        System.out.println(array.length);
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public void smartSort(int[] array) {
        int flag;
        for (int i = 0; i < array.length - 1; i++) {
            flag = 0;
            for (int j = i + 1; j < array.length - i - 1; j++) {
                if (array[i] > array[j]) {
                    int temp;
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
