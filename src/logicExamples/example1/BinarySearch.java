package logicExamples.example1;

public class BinarySearch {

    public static void main(String[] args) {

        int[] table = {1, 2, 9, 11, 12, 17, 25, 34, 38, 47, 58, 74, 88, 95};

        System.out.println("Index: " + searchNumber(table));
    }

    public static int searchNumber(int[] table) {
        int searchNumber = 88;
        int counter = 0;
        int left = 0;
        int right = table.length - 1;
        int center = (left + right) / 2;

        while (left <= right) {
            counter++;
            if (table[center] == searchNumber) {
                System.out.println("Liczba operacji: " + counter);
                return center;
            }
            if (searchNumber < table[center]) {
                right = center - 1;
                center = (left + right) / 2;
            } else {
                left = center + 1;
                center = (left + right) / 2;
            }
        }
        System.out.println("Liczba operacji: " + counter);
        return -1;
    }
}
