package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelsCount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();
        System.out.println(getCount(text));
    }

    public static int getCount(String s) {
        int counter = 0;

        String strToLowerCase = s.toLowerCase();

        for (int i = 0; i < strToLowerCase.length(); i++) {
            switch (s.charAt(i)){
                case 'a':
                    counter++;
                    break;
                case 'e':
                    counter++;
                    break;
                case 'o':
                    counter++;
                    break;
                case 'u':
                    counter++;
                    break;
                case 'i':
                    counter++;
                    break;
                case 'A':
                    counter++;
                    break;
                case 'O':
                    counter++;
                    break;
                case 'U':
                    counter++;
                    break;
                case 'E':
                    counter++;
                    break;
                case 'I':
                    counter++;
                    break;

            }

        }
        return counter;

    }
}
