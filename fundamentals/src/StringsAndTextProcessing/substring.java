package StringsAndTextProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class substring {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String removeWord = reader.readLine();
        String text = reader.readLine();

        while (text.contains(removeWord))

       text = text.replace(removeWord,"");

        System.out.println(text);
    }
}
