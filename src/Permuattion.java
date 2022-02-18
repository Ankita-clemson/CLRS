import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Permuattion {


    public static boolean isPermutation(String s1, String s2) {
        boolean isBoolean = false;
        if (s1.length() != s2.length())
            return false;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        HashMap<Character, Integer> h1 = new HashMap();
        HashMap<Character, Integer> h2 = new HashMap();

        for (Character c : c1) {

            if (h1.containsKey(c)) {
                h1.put(c, h1.get(c).intValue() + 1);

            } else {
                h1.put(c, 1);

            }

        }
        for (Character c : c2) {

            if (h2.containsKey(c)) {
                h2.put(c, h2.get(c).intValue() + 1);

            } else {
                h2.put(c, 1);

            }

        }


        for (char key : s1.toCharArray()) {
            if (h1.get(key) == h2.get(key)) {

                if (h1.get(key).intValue() != h2.get(key).intValue()) {
                    isBoolean = false;
                } else
                    isBoolean = true;

            }
        }

        return isBoolean;
    }


    public static void main(String args[]) {
        String s1 = "WORLD";
        String s2 = "ROLW";
        boolean result = isPermutation(s1, s2);

        System.out.println(result);

    }

}
