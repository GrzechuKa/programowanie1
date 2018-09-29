package homework.logicExamples.easy1;

import java.util.Random;

public class Easy1 {

/*
Napisz program, który w danej tablicy dwuwymiarowej wskaże numery wierszy,
w których elementy tworzą ciąg arytmetyczny.
Określ złożoność obliczeniową Twojego algorytmu.
 */

    public static void main(String[] args) {

        int[][] array = {
                {1, 3, 5, 7, 9},
                {2, 2, 3, 4, 5},
                {1, -1, -3, -5, -7},
                {1, 87, 2, 3, 4},
                {10, 20, 30, 40, 50}
        };

        indexLineWithArithmeticString(array);


    }


    public static void indexLineWithArithmeticString(int[][] array) {
        for (int j = 0; j < array.length; j++) {
            int counter = 1;
            int r = array[j][1] - array[j][0];
            for (int i = 1; i < array[j].length - 1; i++) {
                if (r == array[j][i + 1] - array[j][i]) {
                    counter++;
                }
                if (r != array[j][i + 1] - array[j][i]) {
                    break;
                }
            }
                if(counter >=2){
                    System.out.println("Index wiersza z ciągiem arytmetycznym : " + j);
                }
            }
            System.out.println();
    }


    public static int[][] getRandomArray(int r, int c) {
        Random random = new Random();
        int[][] array = new int[r][c];
        for (int j = 0; j < r; j++) {
            for (int i = 0; i < c; i++) {
                array[j][i] = random.nextInt(1000);
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
        return array;
    }
}
