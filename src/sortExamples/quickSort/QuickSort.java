package sortExamples.quickSort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        // write your code here

        int[] array = setTable(25);
        System.out.println(Arrays.toString(array));
        quicksort(array, 0, array.length-1);
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

    public static void quicksort (int[] array, int lo, int hi){
        if (lo < hi){
            int p = partition(array, lo, hi);
            quicksort(array, lo, p);
            quicksort(array, p+1, hi);
        }
    }

    private static int partition(int[] array, int lo, int hi) {
        int pivot = array[lo];
        int i = lo - 1;
        int j = hi + 1;
        while (true){
            do {
                i+=1;
            }while (array[i] < pivot);
            do{
                j-=1;
            } while (array[j] > pivot);
            if( i>=j){
                return j;
            }
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

}
