package DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriplesOfLatinLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        for (int i = 0; i < a ; i++) {
            for (int j = 0; j < a; j++) {
                for (int k = 0; k < a; k++) {
                    char first = (char) ('a' + i);
                    char second = (char) ('a' + j);
                    char three = (char) ('a' + k);
                    System.out.printf("%c%c%c%n", first,second,three);


                }

            }

        }
    }
}
