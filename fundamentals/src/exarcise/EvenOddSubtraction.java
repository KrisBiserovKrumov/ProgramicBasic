package exarcise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EvenOddSubtraction {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] firstArr = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i <firstArr.length ; i++) {
            if (firstArr[i] % 2 == 0){
                sum1 += firstArr[i];
            }
            else
            {
                sum2 +=firstArr[i];
            }

        }
        int total = sum1 - sum2;
        System.out.println(total);
    }
}
