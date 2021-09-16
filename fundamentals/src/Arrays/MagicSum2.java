package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicSum2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] line = reader.readLine().split(" ");
        int result = Integer.parseInt(reader.readLine());
        int[] numbers = new int [line.length];

        for (int i = 0; i <line.length; i++) {
            numbers[i] = Integer.parseInt(line[i]);
        }
        for (int i = 0; i <numbers.length - 1 ; i++) {
            for (int j = i; j < numbers.length ; j++) {
                int sum = numbers[i] + numbers[j];
                if (sum == result){
                    System.out.println(numbers[i] + " " + numbers[j]);
                    break;
                }

            }

        }
    }
}
