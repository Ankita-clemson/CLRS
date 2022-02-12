import java.util.Objects;
import java.util.TreeMap;

class uniqueCharacters
        {

public static void main(String args[])
        {


        String s ="Ankita";
        s=s.toUpperCase();

        for(int i =0;i<=s.length()-1;i++)
        {
                for(int j =i+1;j<=s.length()-1;j++) {

                        int char1 = (int) s.charAt(i);
                        int char2 = (int) s.charAt(j);

                        if(char1 == char2)
                        {
                                System.out.println("Duplicate");


                        }


                }

        }
        }


        }

