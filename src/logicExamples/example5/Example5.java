package logicExamples.example5;

import java.util.Random;

public class Example5 {

    public static void main(String[] args) {
        // write your code here


//        int[][] array = {{1, 0, 1, 0, 1, 0, 0, 0},
//                {0, 1, 0, 0, 10, 0, 0, 0},
//                {0, 0, 1, 0, 0, 1, 0, 0},
//                {0, 0, 0, 1, 0, 1, 0, 0},
//                {0, 0, 0, 0, 1, 0, 10, 0},
//                {0, 0, 0, 0, 0, 1, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 1}};

        int[][] array = getRandomArray(10, 10);
        printTable(array);

        numerWiersza(array);

    }


    public static int[][] getRandomArray(int r, int c) {
        Random random = new Random();
        int[][] array = new int[r][c];
        for (int j = 0; j < r; j++) {
            for (int i = 0; i < c; i++) {
                array[j][i] = random.nextInt(2);
            }
        }
        return array;
    }

    public static void printTable(int[][] table) {

        for (int j = 0; j < table.length; j++) {
            int sumaLini = 0;
            for (int i = 0; i < table[j].length; i++) {
                System.out.print(table[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void numerWiersza(int[][] table) {
        int indexWiersza = -1;
        int maxElementow = -1;

        for (int j = 0; j < table.length; j++) {
            int licznikElementow = 1;
            for (int i = 0; i < table[j].length - 1; i++) {
                if (table[j][i] == table[j][i + 1]) {
                    licznikElementow++;
                } else{
                    licznikElementow = 1;
                }
                if (maxElementow < licznikElementow && licznikElementow >= 2) {
                    maxElementow = licznikElementow;
                    indexWiersza = j;
                }
            }
        }
        if (indexWiersza == -1) {
            System.out.println("Nie ma żadnego wiersza, który miałby 2 elementy takie same koło siebie");
        } else {
            System.out.println("Wiersz z maksymalną liczbą tych samych elemntów koło siebie to : " + indexWiersza);
            System.out.println("Liczba tych elementów to : " + maxElementow);
        }
    }

}
