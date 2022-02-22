/**
 * This class inserts %20 whenever it encounters a space in String
 **/
public class URLify {

    public static String urlify(String s1, int truelength) {
        int countspaces = 0;
        char[] charobj = s1.toCharArray();
        for (int i = truelength - 1; i < charobj.length; i++) {
            if (charobj[i] == ' ') {
                countspaces++;
            }
        }

        for (int i = truelength - 1; i >= 0; i--) {
            if (charobj[i] == ' ' && countspaces != 0) {
                for (int j = truelength - 1; j > i; j--) {
                    char temp = charobj[j];
                    charobj[j + 2] = temp;


                }
                countspaces = countspaces - 2;
                charobj[i] = '%';
                charobj[i + 1] = '2';
                charobj[i + 2] = '0';
                truelength = truelength + 2;

            }
        }


        return String.valueOf(charobj);
    }


    public static void main(String args[]) {
        String s1 = "Mr John Smith    ";

        int truelength = 13;
        String result = urlify(s1, truelength);
        System.out.println(result);
    }
}
