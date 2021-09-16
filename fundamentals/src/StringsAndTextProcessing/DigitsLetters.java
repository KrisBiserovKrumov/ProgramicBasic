package StringsAndTextProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitsLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        String newtext = text.replaceAll("[^0-9]","");
        System.out.println(newtext);

        String textt = text.replaceAll("[^\\w]","");
        String newtextt = textt.replaceAll("[0-9]","");
        System.out.println(newtextt);


        String endd = text.replaceAll("\\w","");
        System.out.println(endd);
    }
}
