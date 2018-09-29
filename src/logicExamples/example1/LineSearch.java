package logicExamples.example1;

public class LineSearch {

//    Wyszukiwanie liniowe

    public static void main(String[] args) {
        // write your code here

        int[] table = {1, 8, 9, 55, 2, 77, 5, 4, 33, 17, 88, 44};

        int searchNumber = 77;
        int numberOperation = 1;

        for (int i = 0; i <table.length; i++) {

            if (searchNumber == table[i]) {
                System.out.println("Index: " + i);
                System.out.println("Liczba operacji: " + numberOperation);
                break;
            }
            numberOperation++;
        }
    }

}
