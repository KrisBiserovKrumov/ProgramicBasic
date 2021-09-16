package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRotation2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = reader.readLine().split(" ");
        int rot = Integer.parseInt(reader.readLine());
        int rotation = rot % numbers.length;
        for (int i = 0; i < rotation; i++) {
            String element = numbers[0];


            for (int j = 0; j < numbers.length - 1; j++) {
                numbers[j] = numbers[j + 1];
            }
            numbers[numbers.length - 1] = element;
        }
        for (String number : numbers) {
            System.out.print(number + " ");

        }

    }
}
