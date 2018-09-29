package sortExamples.inserionSort;

import java.util.Arrays;
import java.util.Random;

public class InserionSort {

    public static void main(String[] args) {
        // write your code here

        int[] array = setTable(35);
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));


    }

    public static void insertionSort(int array[]){
        int i = 1;
        while (i < array.length){
            int j = i;
            while (j > 0 && array[j-1] > array[j]){
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                j -= 1;
            }
            i += 1;
        }
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
