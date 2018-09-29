package logicExamples.example7;

import java.util.Random;

public class Example7 {

    public static void main(String[] args) {
        // write your code here

//        int[][] table = {{1, 0, 0, 0, 0, 0, 0, 0},
//                        {0, 1, 0, 0, 0, 0, 0, 0},
//                        {0, 0, 1, 0, 0, 0, 0, 0},
//                        {0, 0, 0, 1, 0, 0, 0, 0},
//                        {0, 0, 0, 0, 1, 0, 0, 0},
//                        {0, 0, 0, 0, 0, 1, 0, 0},
//                        {0, 0, 0, 0, 0, 0, 1, 0},
//                        {0, 0, 0, 0, 0, 0, 0, 1}};

        int[][] table = setTowerOnTable(8);
        printTable(table);

        bicie(table);

    }

    public static void bicie(int[][] table) {

        for (int j = 0; j < table.length; j++) {
            int sum = 0;
            for (int i = 0; i < table[j].length; i++) {
                sum += table[j][i];
            }
            if (sum > 1 || sum == 0) {
                System.out.println("Jest bicie");
                return;
            }
        }
        for (int j = 0; j < table.length; j++) {
            int sum = 0;
            for (int i = 0; i < table[j].length; i++) {
                sum += table[i][j];
            }
            if (sum > 1 || sum == 0) {
                System.out.println("Jest bicie");
                return;
            }
        }
        System.out.println("Nie ma bicia");
    }

    public static int[][] setTowerOnTable(int n) {
        int[][] table = new int[n][n];
        Random random = new Random();
        int towerCount = 0;
        while (towerCount < n) {
            int j = random.nextInt(n);
            int i = random.nextInt(n);
            if (table[j][i] == 0) {
                table[j][i] = 1;
                towerCount++;
            }
        }
        return table;
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
}
