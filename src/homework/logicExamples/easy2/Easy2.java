package homework.logicExamples.easy2;

import java.util.Scanner;

public class Easy2 {

    /*
    Zaimplementuj rekurencyjny algorytm liczenia silni z podanej liczby
    (https://pl.wikipedia.org/wiki/Silnia).
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę do wyliczenia silni : ");

        System.out.println(strongNumber(scanner.nextInt()));

    }


    public static int strongNumber(int number) {

        if (number < 0) {
            return -1;
        }
        if (number == 0){
            return 1;
        }

        return number * strongNumber(number - 1);

    }


}
