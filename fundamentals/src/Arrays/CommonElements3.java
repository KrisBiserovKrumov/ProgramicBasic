package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonElements3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] text = reader.readLine().split(" ");
        String[] textTwo = reader.readLine().split(" ");

        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < textTwo.length; j++) {
                if (text[i].equals(textTwo[j])){
                    System.out.print(textTwo[j] + " ");
                }

            }

        }
    }
}
