package StringsAndTextProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class repeatString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = reader.readLine().split(" ");

        for (int i = 0; i < words.length; i++) {
            int wordLenght = words[i].length();

            for (int j = 0; j < wordLenght; j++) {
                System.out.print(words[i]);

            }


        }
    }
}
