package StringsAndTextProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class repeatStringg {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] text = reader.readLine().split(" ");


        for (int i = 0; i < text.length ; i++) {
            for (int j = 0; j <text[i].length() ; j++) {
                System.out.print(text[i]);

            }

        }
    }
}
