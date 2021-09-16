package exarcise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reader.readLine().split(" ");
        int posicion = Integer.parseInt(reader.readLine());
        int rotatacion = posicion % numbers.length;

        for (int i = 0; i < rotatacion; i++) {
            String numb = numbers[0];
            for (int j = 0; j < numbers.length - 1  ; j++) {
                numbers[j] = numbers[j + 1];
            }
             numbers[numbers.length - 1 ] = numb;

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");

        }
    }
}
