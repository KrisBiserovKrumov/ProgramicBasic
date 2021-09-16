package exarcise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CondenseArrayNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        while (numbers.length > 1){
            int [] conden = new int[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1 ; i++) {
                conden[i] = numbers[i] + numbers[i + 1];
            }
            numbers  = conden;
        }
        System.out.println(numbers[0]);
    }
}
