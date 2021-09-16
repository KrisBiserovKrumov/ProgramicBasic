package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CondenseArrayToNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split(" ");
        int[] numbers = new int[line.length];
        int[] sum = new int[line.length - 1];




        for (int i = 0; i < line.length; i++) {
            numbers[i] = Integer.parseInt(line[i]);

            for (int j = 0; j < sum.length  ; j++) {
                sum [j] = numbers[j] + numbers[j + 1];


            }
            sum[i] = numbers[i];
        }
    }
}
