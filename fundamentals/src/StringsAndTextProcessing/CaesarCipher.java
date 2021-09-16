package StringsAndTextProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaesarCipher {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        for (int i = 0; i < input.length(); i++) {
            char symbol = (char) (input.charAt(i) + 3);
            System.out.print(symbol);

        }
        System.out.println();
    }
}
