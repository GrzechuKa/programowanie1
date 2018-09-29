package logicExamples.example4;

import java.util.Random;

public class Example4 {

    public static void main(String[] args) {
        // write your code here

        int[][] table = getRandomArray(10, 10);

        int index = getIndexMaxValue(table);

        System.out.println("Wiersz z najmniejszą wartością maksymalna : " + index);


    }

    public static int[][] getRandomArray (int r, int c){
        Random random = new Random();
        int [][] array = new int[r][c];
        for(int j = 0; j < r; j++){
            for (int i = 0; i < c; i++){
                array[j][i] = random.nextInt(1000);
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
        return array;
    }

    public static int getIndexMaxValue(int[][] table){
        int min = Integer.MAX_VALUE;
        int x = -1;
        for(int j = 0; j < table.length; j++){
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < table[j].length; i++){
                if(max < table[j][i]){
                    max = table[j][i];
                }
            } if (max < min){
                min = max;
                x = j;
            }
        }return x;
    }
}
