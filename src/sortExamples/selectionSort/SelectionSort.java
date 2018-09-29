package sortExamples.selectionSort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {
        // write your code here
        int[] array = setTable(25);
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));

    }

    public static int[] setTable(int l) {
        int[] table = new int[l];
        Random random = new Random();
        for (int i = 0; i < l; i++) {
            table[i] = random.nextInt(101);
        }
        return table;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
