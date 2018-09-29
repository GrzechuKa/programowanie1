package logicExamples.example3;

import java.util.Scanner;

public class Example3 {

//    Czy wskazana liczba jest liczną pierwszą

    public static void main(String[] args) {
        // write your code here
        int x;
        System.out.println("Podaj liczbę : ");
        Scanner scanner = new Scanner(System.in);

        x = scanner.nextInt();

        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                System.out.println("Nie jest liczbą pierwszą");
                return;
            }
        }

        System.out.println("Jest liczbą pierwszą");
    }
}
