package StringsAndTextProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterMultiplier {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int result = charMulti(input[0],input[1]);

        System.out.println(result);
    }

    private static int charMulti(String first, String second) {
        int result = 0;

        int lenght = Math.min(first.length(),second.length());

        for (int i = 0; i < lenght; i++) {
            result += first.charAt(i) * second.charAt(i);

        }
        if (first.length() > second.length()){
            for (int i = lenght; i <first.length(); i++) {
                result += first.charAt(i);

            }
        }else {
            for (int i = lenght; i <second.length(); i++) {
                result += second.charAt(i);

            }

        }


        return result;
    }
}
