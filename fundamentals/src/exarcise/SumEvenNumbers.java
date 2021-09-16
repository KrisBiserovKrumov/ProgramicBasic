package exarcise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SumEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] firstArr = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;
        for (int i = 0; i <firstArr.length ; i++) {
            if (firstArr[i] % 2 == 0){
                sum += firstArr[i];
            }

        }
        System.out.println(sum);
    }
}
