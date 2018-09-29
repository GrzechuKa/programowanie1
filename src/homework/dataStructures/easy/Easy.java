package homework.dataStructures.easy;

import java.util.Scanner;

public class Easy {

//    Napisz program, który odwróci podany napis przy użyciu stosu.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tekst do odwrócenia : ");

        try{
            System.out.println("Odwrócony tekst to: " + reverseText(scanner.nextLine()));
        } catch (EmptyCharStackExeption e) {
            e.printStackTrace();
        }

    }

    public static String reverseText (String stringToReverse) throws EmptyCharStackExeption {

        CharStack charStack = new CharStack(stringToReverse.length());

        for (int i=0; i < stringToReverse.length(); i++){
            charStack.push(stringToReverse.charAt(i));

        }

        StringBuilder reverseText = new StringBuilder();
        while(!charStack.isEmpty()){
            reverseText.append(charStack.pop());
        }

        return reverseText.toString();
    }

}
