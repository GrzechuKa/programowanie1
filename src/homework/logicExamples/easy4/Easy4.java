package homework.logicExamples.easy4;

import java.util.Scanner;

public class Easy4 {

    /*
    Zaimplementuj algorytm, który metodą rekurencyjną odwróci przekazany napis.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst do odrócenia : ");

        System.out.println(returnReverseText(scanner.nextLine()));
    }


    public static String returnReverseText (String str){
        if (str ==  null || str.isEmpty()) {
            throw new IllegalArgumentException("String jest pusty");
        }
        return returnReverseText (str, 0);
    }

    public static String returnReverseText (String str, int i){
        String reversString;
        if (i == str.length() -1) {
            return String.valueOf(str.charAt(i));
        }
        return returnReverseText(str, i + 1) + str.charAt(i);
    }
}
