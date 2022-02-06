import java.util.Locale;
import java.util.Scanner;

public class PlayCipher {
    //constructor of the class
    PlayCipher()
    {
        System.out.println("Enter the key for cipher:");
        Scanner sc = new Scanner(System.in);
        String key = parseString(sc);
    }

    String parseString(Scanner sc)
    {
        String parse = sc.nextLine();
        parse=parse.toUpperCase();
        parse= parse.replaceAll("[^A-Z]","");
        parse=parse.replace("J","I");
        return parse;
    }
    public static void main(String args[])
    {
        PlayCipher cp = new PlayCipher();


    }
}
