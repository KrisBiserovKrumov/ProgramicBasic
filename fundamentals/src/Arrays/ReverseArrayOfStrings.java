package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArrayOfStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] elements = reader.readLine().split( " ");
        for (int i = 0; i < elements.length / 2; i++) {
            String oddelements = elements[i];
            elements [i] = elements[elements.length - 1 - i];
            elements[elements.length - 1 - i] = oddelements;
        }
        System.out.println(String.join(" ", elements));

    }
}
