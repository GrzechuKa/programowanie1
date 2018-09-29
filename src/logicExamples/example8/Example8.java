package logicExamples.example8;

import java.util.HashMap;
import java.util.Map;

public class Example8 {

    public static void main(String[] args) {
        // write your code here

        String a = "egg";
        String b = "add";

        if (setMap(a, b) == true) {
            System.out.println("Są izomorficzne");
        } else
            System.out.println("Nie są izomorficzne");
    }


    public static boolean setMap(String a, String b) {

        char[] tabA = a.toCharArray();
        char[] tabB = b.toCharArray();
        Map<Character, Character> map = new HashMap<>();

        if (tabA.length == tabB.length) {
            int N = tabA.length;
            for (int i = 0; i < N; i++) {
                if (map.containsKey(tabA[i]) && map.get(tabA[i]) != tabB[i]) {
                    return false;
                }
                map.put(tabA[i], tabB[i]);
            }
        } else {
            return false;
        }
        return true;
    }

}
