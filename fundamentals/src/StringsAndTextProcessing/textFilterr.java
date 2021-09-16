package StringsAndTextProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class textFilterr {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] replacemant = reader.readLine().split(", ");
        String text = reader.readLine();

        for (String replace : replacemant) {
            String data = replace.replaceAll(".","*");
            text = text.replace(replace,data);
        }
        System.out.println(text);
    }
}
