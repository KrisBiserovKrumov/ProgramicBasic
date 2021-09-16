package exarcise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PrintNumbersReverseOrder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        int[] firstArr = new int[a] ;


        for (int i = 0; i < a ; i++) {
            int numbs = Integer.parseInt(reader.readLine());
            firstArr[i] = numbs;

        }
        for (int i = firstArr.length - 1; i >= 0 ; i--) {
            System.out.print(firstArr[i] + " ");

        }
    }
}
