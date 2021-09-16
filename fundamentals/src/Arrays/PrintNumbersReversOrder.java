package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintNumbersReversOrder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());

        int[] number = new int[a];

        for (int i = 0; i < a; i++) {
            int n = Integer.parseInt(reader.readLine());

            number[i] = n;
        }
        for (int i = number.length - 1 ; i >= 0 ; i--) {
            System.out.print( number[i] + " ") ;
            
        }
    }
}
