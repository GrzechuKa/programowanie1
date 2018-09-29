package sortExamples.mergeSort;

import java.util.Arrays;
import java.util.Random;

public class mergeSort {

    public static void main(String[] args) {
        // write your code here
        int[] array = setTable(30);
        System.out.println(Arrays.toString(array));

        margeSort(array, 0, array.length - 1);
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

    public static void margeSort(int[] array, int p, int r) {
        if (p < r) {
            int m = (p + r) / 2;
            margeSort(array, p, m);
            margeSort(array, m + 1, r);
            marge(array, p, m, r);
        }
    }

    private static void marge(int[] array, int p, int m, int r) {
        int[] arrayTemp = new int[r - p + 1];
        int i = p;
        int j = m + 1;
        int k = 0;
        while (i <= m && j <= r) {
            if (array[i] <= array[j]) {
                arrayTemp[k++] = array[i++];
            } else {
                arrayTemp[k++] = array[j++];
            }
        }
        while (i <= m) {
            arrayTemp[k++] = array[i++];
        }
        while (j <= r) {
            arrayTemp[k++] = array[j++];
        }
        for (k = 0; k <= r - p; k++) {
            array[p + k] = arrayTemp[k];
        }
    }
}
