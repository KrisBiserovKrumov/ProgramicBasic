package StringsAndTextProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();

        while (!word.equals("end")){
            String reversed ="";

            for (int i = word.length() - 1; i >= 0 ; i--) {
                reversed += word.charAt(i);

            }
            System.out.println(word + " = " + reversed);


            word = reader.readLine();
        }
    }
}
