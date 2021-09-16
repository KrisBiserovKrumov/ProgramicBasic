package StringsAndTextProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringExplosion {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();
        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char symbol = text.charAt(i);

            if (symbol == '>'){
                result += symbol;
                i++;
                int explosion = text.charAt(i) - '0';

                explosion--;

                while (explosion > 0 && text.length() - 1 > i) {
                    i++;
                    symbol = text.charAt(i);
                    if (symbol == '>'){
                        result += symbol;
                        i++;
                         explosion += text.charAt(i) - '0';
                         explosion--;
                         continue;
                    }
                    explosion--;
                }
            }else {
                result += symbol;
            }

        }
        System.out.print(result);
    }
}
