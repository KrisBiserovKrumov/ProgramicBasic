package exarcise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReverseArrayStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbs = reader.readLine().split(" ");


        for (int i = numbs.length - 1; i >= 0 ; i--) {
            System.out.print(numbs[i] + " ");

        }
    }
}
