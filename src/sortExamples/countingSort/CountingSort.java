package sortExamples.countingSort;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        // write your code here

        int[] arrayA = {0, 5, 5, 4, 3, 3, 1, 0, 2, 4};
        int[] arrayB = new int[arrayA.length];
        int k = findK(arrayA);
        System.out.println(k);

        countingSort(arrayA, arrayB, k);

        System.out.println(Arrays.toString(arrayB));
    }

    public static void countingSort(int[] arrayA, int[] arrayB, int k) {
        int[] arrayC = new int[k];

        for (int i = 0; i < k; i++) {
            arrayC[i] = 0;
        }
        for (int j = 0; j < arrayA.length; j++) {
            arrayC[arrayA[j]] += 1;
        }
        for (int i = 1; i < k; i++) {
            arrayC[i] = arrayC[i] + arrayC[i - 1];
        }
        for (int j = 0; j < arrayA.length; j++) {
            arrayB[arrayC[arrayA[j]] - 1] = arrayA[j];
            arrayC[arrayA[j]] = arrayC[arrayA[j]] - 1;
        }
    }

    public static int findK(int[] array) {
        int arrayMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (arrayMax < array[i]) {
                arrayMax = array[i];
            }
        }
        return arrayMax + 1;
    }
}
