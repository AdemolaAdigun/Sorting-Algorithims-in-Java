import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] unsortedArray = new int[]{10,9,8,7,6,5,4,3,2,1};

        for (int i = 1; i < unsortedArray.length; i++) { //loop through array from index [1]
            int value = unsortedArray[i]; //assign [1] value to temp variable
            int hole = i;
                while(hole > 0 && unsortedArray[hole - 1] > unsortedArray[hole]){ //comparing current value with value before current
                    unsortedArray[hole] = unsortedArray[hole - 1]; //swap
                    unsortedArray[hole - 1] = value; //putting the value to its new position
                    hole--;
                }
            //}
        }

        System.out.println(Arrays.toString(unsortedArray));
    }
}

