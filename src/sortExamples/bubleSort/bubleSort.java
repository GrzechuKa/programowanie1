package sortExamples.bubleSort;

import java.util.Arrays;
import java.util.Random;

public class bubleSort {

    public static void main(String[] args) {
        // write your code here

        int[] table = setTable(25);
        System.out.println(Arrays.toString(table));

        bubbleSort(table);

        System.out.println(Arrays.toString(table));

    }

    public static void bubbleSort(int[] table) {
        boolean swapped = false;
        int temp;
        do {
            swapped = false;
            for (int i = 1; i < table.length; i++) {
                if (table[i - 1] > table[i]) {
                    temp = table[i - 1];
                    table[i - 1] = table[i];
                    table[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static int[] setTable(int l) {
        int[] table = new int[l];
        Random random = new Random();
        for (int i = 0; i < l; i++) {
            table[i] = random.nextInt(101);
        }
        return table;
    }
}
